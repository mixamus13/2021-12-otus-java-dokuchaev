package ru.otus.homework.proxy;

import ru.otus.homework.interfaces.OriginalActionInterface;
import ru.otus.homework.domain.OriginalClassActionImpl;
import ru.otus.homework.handler.CustomInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyClass {

    private ProxyClass() {}

    public static OriginalActionInterface createMyClass() {
        InvocationHandler invocationHandler = new CustomInvocationHandler(new OriginalClassActionImpl());
        return (OriginalActionInterface) Proxy.newProxyInstance(
                ProxyClass.class.getClassLoader(), new Class<?>[]{OriginalActionInterface.class}, invocationHandler);
    }
}
