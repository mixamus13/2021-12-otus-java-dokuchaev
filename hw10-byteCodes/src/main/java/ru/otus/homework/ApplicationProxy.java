package ru.otus.homework;

import ru.otus.homework.interfaces.OriginalActionInterface;
import ru.otus.homework.proxy.ProxyClass;

public class ApplicationProxy {
    public static void main(String... args) {
        OriginalActionInterface originalActionInterface = ProxyClass.createMyClass();
        originalActionInterface.originalAction("action");
    }
}
