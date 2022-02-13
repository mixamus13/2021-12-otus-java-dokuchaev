package ru.otus.homework;

import ru.otus.homework.domain.TesterClass;

public class Application {
    public static void main(String... args) throws ClassNotFoundException {
        TesterClass.runTester("ru.otus.homework.domain.PersonTest");
    }
}
