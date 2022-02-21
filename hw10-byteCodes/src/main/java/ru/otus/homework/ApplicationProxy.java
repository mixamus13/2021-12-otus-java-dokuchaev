package ru.otus.homework;

public class ApplicationProxy {
    public static void main(String... args) {
        OriginalInterface originalInterface = ProxyCustom.createMyClass();
        originalInterface.originalAction("action");
    }
}
