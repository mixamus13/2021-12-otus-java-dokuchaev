package ru.otus.homework;

import java.util.Arrays;

public class TestLoggingImpl implements TestLogging {


    @Override
    public int calculation(int param1) {
        return param1;
    }

    @Override
    public int calculation(int param1, int param2) {
        int[] params = {param1, param2};
        return calculation(params);
    }

    @Log
    @Override
    public int calculation(int param1, int param2, int param3) {
        int[] params = {param1, param2, param3};
        return calculation(params);
    }

    @Override
    public int calculation(int[] params) {
        return Arrays.stream(params).sum();
    }
}
