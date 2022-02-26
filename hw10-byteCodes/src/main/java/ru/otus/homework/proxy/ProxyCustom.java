package ru.otus.homework.proxy;

import ru.otus.homework.domain.TestLogging;
import ru.otus.homework.domain.TestLoggingImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyCustom {

    public static TestLogging createMyClass() {
        InvocationHandler handler = new DynamicInvocationHandler(new TestLoggingImpl());
        return (TestLogging) Proxy.newProxyInstance(ProxyCustom.class.getClassLoader(),
                new Class<?>[]{TestLogging.class}, handler);
    }
}
