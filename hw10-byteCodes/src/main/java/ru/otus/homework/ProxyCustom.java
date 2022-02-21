package ru.otus.homework;

import java.lang.reflect.*;
import java.util.Arrays;

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
            Parameter[] parameters = methodCalculation.getParameters();
            System.out.println("parameters = " + Arrays.toString(parameters));

            if (methodCalculation.isAnnotationPresent(Log.class)) {
                System.out.println("executed method: " + methodCalculation.getName());
                return method.invoke(originalInterface, args);
            }

            return method.invoke(originalInterface, args);
        }
    }
}
