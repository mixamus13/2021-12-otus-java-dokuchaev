package ru.otus.homework;

import com.google.common.collect.Lists;

import java.util.List;

public class HelloOtus {
    public static void main(String... args) {
        List<String> listName = List.of("Max", "Melisa", "Luke", "Anna", "Bob");
        System.out.println("Lists.reverse(listName) = " + Lists.reverse(listName));
    }
}
