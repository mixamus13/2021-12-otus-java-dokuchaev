package ru.otus.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;

public class ProxyCustom {

    private ProxyCustom() {
    }

    static OriginalInterface createMyClass() {
        InvocationHandler invocationHandler = new CustomInvocationHandler(new OriginalClassImpl());
        return (OriginalInterface) Proxy.newProxyInstance(CustomInvocationHandler.class.getClassLoader(),
                new Class<?>[]{OriginalInterface.class},
                invocationHandler);
    }

    static final class CustomInvocationHandler implements InvocationHandler {
        private final OriginalInterface originalInterface;

        CustomInvocationHandler(OriginalInterface originalInterface) {
            this.originalInterface = originalInterface;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("invoking method: " + method);

            Class<TestLoggingImpl> clazz = TestLoggingImpl.class;
            Method methodCalculation = clazz.getDeclaredMethod("calculation", int.class);

            if (methodCalculation.isAnnotationPresent(Log.class)) {
                Parameter[] parameters = methodCalculation.getParameters();
                System.out.println(parameters[0]);
                System.out.println("executed method: " + methodCalculation.getName());
                return method.invoke(originalInterface, args);
            }

            return method.invoke(originalInterface, args);
        }
    }
}
