package ru.otus.homework.domain;

import ru.otus.homework.annotation.Log;

public class TestLoggingImpl implements TestLogging {

    @Override
    public void calculation(int paramOne) {
        System.out.println("calculation 1 param");
    }

    @Log
    @Override
    public void calculation(int paramOne, int paramTwo) {
        System.out.println("calculation 2 param");
    }

    @Override
    public void calculation(int paramOne, int paramTwo, int paramThree) {
        System.out.println("calculation 3 param");
    }
}
