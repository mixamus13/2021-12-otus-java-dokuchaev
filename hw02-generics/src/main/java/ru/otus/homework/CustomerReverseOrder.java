package ru.otus.homework;

import java.util.Deque;
import java.util.LinkedList;

public class CustomerReverseOrder {

    private Deque<Customer> customers = new LinkedList<>();

    // todo: 2. надо реализовать методы этого класса
    // надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"

    public void add(Customer customer) {
        customers.add(customer);
    }

    public Customer take() {
        return customers.pollLast();
    }
}
