package ru.otus.homework;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

    private final NavigableMap<Customer, String> navigable = new TreeMap<>(Comparator.comparingLong(Customer::getScores));

    public Map.Entry<Customer, String> getSmallest() {
        //Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk
        return copyCustom(navigable.firstEntry());
    }

    private Map.Entry<Customer, String> copyCustom(Map.Entry<Customer, String> entry) {
        return entry != null ? Map.entry(new Customer(entry.getKey()), entry.getValue()) : null;
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return copyCustom(navigable.higherEntry(customer));
    }

    public void add(Customer customer, String data) {
        navigable.put(customer, data);
    }
}
