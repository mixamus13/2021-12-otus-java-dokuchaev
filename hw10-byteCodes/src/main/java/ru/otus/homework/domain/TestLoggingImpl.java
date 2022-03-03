package ru.otus.homework.domain;

import ru.otus.homework.annotation.Log;

public class TestLoggingImpl implements TestLogging {

    @Override
    public void calculation(int paramOne) { }

    @Log
    @Override
    public void calculation(int paramOne, int paramTwo) { }

    @Override
    public void calculation(int paramOne, int paramTwo, int paramThree) { }
}
