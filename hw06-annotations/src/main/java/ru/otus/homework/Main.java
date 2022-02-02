package ru.otus.homework;

import ru.otus.homework.domain.Person;
import ru.otus.homework.domain.PersonTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String... args) throws NoSuchMethodException {

        System.out.println("-------------------------------------------");
        Class<PersonTest> clazz = PersonTest.class;

        System.out.println("-------------------------------------------");
        Method annotationsMethodBefore = clazz.getMethod("methodBefore");
        System.out.println("annotationsMethodBefore = " + annotationsMethodBefore);
        Method annotationsMethodTest = clazz.getMethod("methodTest");
        System.out.println("annotationsMethodTest = " + annotationsMethodTest);
        Method annotationsMethodAfter = clazz.getMethod("methodAfter");
        System.out.println("annotationsMethodAfter = " + annotationsMethodAfter);

        System.out.println("-------------------------------------------");

    }
}
