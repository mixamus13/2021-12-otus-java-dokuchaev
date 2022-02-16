package ru.otus.homework.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.otus.homework.interfaces.OriginalActionInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(CustomInvocationHandler.class);

    private final OriginalActionInterface originalActionInterface;

    public CustomInvocationHandler(OriginalActionInterface originalActionInterface) {
        this.originalActionInterface = originalActionInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LOGGER.info("invoke method: " + method);
        return method.invoke(originalActionInterface, args);
    }

    @Override
    public String toString() {
        return "CustomInvocationHandler{" +
                "originalActionInterface=" + originalActionInterface +
                '}';
    }
}
