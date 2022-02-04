package ru.otus.homework;

import ru.otus.homework.domain.TesterClassStream;

public class Application {
    public static void main(String... args) throws ClassNotFoundException {
        TesterClassStream.runTesterStream("ru.otus.homework.domain.PersonTest");
        //TesterClass.runTester("ru.otus.homework.domain.PersonTest");
    }
}
