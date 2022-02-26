package ru.otus.homework;

public class OriginalClassImpl implements OriginalInterface {

    @Override
    public void originalAction(String param) {
        new TestLoggingImpl().calculation(6);
    }
}
