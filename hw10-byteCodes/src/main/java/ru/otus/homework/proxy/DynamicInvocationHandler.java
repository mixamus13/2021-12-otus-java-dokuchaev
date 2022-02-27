package ru.otus.homework.proxy;

import ru.otus.homework.domain.TestLogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicInvocationHandler implements InvocationHandler {

    private final TestLogging testLogging;

    public DynamicInvocationHandler(TestLogging testLogging) {
        this.testLogging = testLogging;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(testLogging, args);
    }
}
