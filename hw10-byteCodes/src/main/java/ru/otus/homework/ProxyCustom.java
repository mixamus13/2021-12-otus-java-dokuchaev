package ru.otus.homework;

import java.lang.reflect.*;
import java.util.*;

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
        private final Map<Method, Boolean> methodSet;

        CustomInvocationHandler(OriginalInterface originalInterface) {
            this.originalInterface = originalInterface;
            methodSet = new HashMap<>();
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            if (!methodSet.containsKey(method)) {
                Method originalMethod = originalInterface.getClass().getMethod(method.getName(), method.getParameterTypes());
                methodSet.put(originalMethod, originalMethod.isAnnotationPresent(Log.class));
            }
            if (Boolean.TRUE.equals(methodSet.get(method))) {
                doLog(method, args);
            }
            return method.invoke(originalInterface, args);
        }

        private void doLog(Method method, Object[] args) {
            System.out.print(method.getName() + ": ");
            System.out.println(Arrays.toString(args));
        }
    }
}
