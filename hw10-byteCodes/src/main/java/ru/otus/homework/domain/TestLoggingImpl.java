package ru.otus.homework.domain;

import ru.otus.homework.annotation.Log;

public class TestLoggingImpl implements TestLogging {

    @Log
    @Override
    public void calculation(int paramOne) { }

    @Override
    public void calculation(int paramOne, int paramTwo) { }

    @Override
    public void calculation(int paramOne, int paramTwo, int paramThree) { }
}
