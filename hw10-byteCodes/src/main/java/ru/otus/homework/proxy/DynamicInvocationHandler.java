package ru.otus.homework.proxy;

import ru.otus.homework.annotation.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DynamicInvocationHandler implements InvocationHandler {

    private final Object original;
    private final Set<Method> logging;

    public DynamicInvocationHandler(Object original) {
        this.original = original;
        logging = new HashSet<>();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method originalMethod = original.getClass().getMethod(method.getName(), method.getParameterTypes());
        if (originalMethod.isAnnotationPresent(Log.class)) {
            System.out.print(method.getName() + " : ");
            System.out.println(Arrays.toString(args));
        }
        return method.invoke(original, args);
    }
}
