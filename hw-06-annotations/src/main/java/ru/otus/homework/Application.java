package ru.otus.homework;

import ru.otus.homework.model.TestClass;

public class Application {
    public static void main(String... args) throws ClassNotFoundException {
        TestClass.runTester("ru.otus.homework.model.PersonTest");
    }
}
