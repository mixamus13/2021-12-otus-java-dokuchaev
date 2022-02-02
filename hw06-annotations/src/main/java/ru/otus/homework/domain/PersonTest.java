package ru.otus.homework.domain;

import ru.otus.homework.annotations.After;
import ru.otus.homework.annotations.Before;
import ru.otus.homework.annotations.Test;

public class PersonTest {

    @After
    public void methodBefore() {
        System.out.println("methodBefore()");
    }

    @Test
    public void methodTest() {
        System.out.println("methodTest()");
    }

    @Before
    public void methodAfter() {
        System.out.println("methodAfter()");
    }
}
