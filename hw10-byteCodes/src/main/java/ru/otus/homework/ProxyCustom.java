package ru.otus.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

public class ProxyCustom {

    private ProxyCustom() {
    }

    static OriginalInterface createMyClass(Class<?> clazz) {

        List<Method> methods = Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(Log.class))
                .toList();

        OriginalClassImpl origin = null;
        try {
            origin = (OriginalClassImpl) clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        if (methods.isEmpty()) {
            return origin;
        }

        InvocationHandler invocationHandler = new CustomInvocationHandler(origin);
        return (OriginalInterface) Proxy.newProxyInstance(CustomInvocationHandler.class.getClassLoader(),
                new Class<?>[]{OriginalInterface.class},
                invocationHandler);
    }
}
