package ru.otus.homework.model;

import ru.otus.homework.annotations.After;
import ru.otus.homework.annotations.Before;
import ru.otus.homework.annotations.Test;

public class PersonTest {

    @Test
    public void methodTest() {
        System.out.println("methodTest()");
    }

    @Before
    public void methodBefore() {
        System.out.println("methodBefore()");
    }

    @After
    public void methodAfter() {
        System.out.println("methodAfter()");
    }
}
