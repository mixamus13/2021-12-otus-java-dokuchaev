package ru.otus.homework;

public class TestLoggingImpl implements TestLogging {

    @Log
    @Override
    public void calculation(int paramOne) {
        System.out.println("calculation 1 param");
    }

    @Override
    public void calculation(int paramOne, int paramTwo) {
        System.out.println("calculation 1 param");
    }

    @Override
    public void calculation(int paramOne, int paramTwo, int paramThree) {
        System.out.println("calculation 3 param");
    }
}
