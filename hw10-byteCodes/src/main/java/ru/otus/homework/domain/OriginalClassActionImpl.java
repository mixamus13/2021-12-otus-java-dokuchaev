package ru.otus.homework.domain;

import ru.otus.homework.logging.TestLogging;
import ru.otus.homework.interfaces.OriginalActionInterface;

public class OriginalClassActionImpl implements OriginalActionInterface {
    @Override
    public void originalAction(String param) {
        new TestLogging().calculation(6);
    }

    @Override
    public String toString() {
        return "OriginalClassActionImpl{}";
    }
}
