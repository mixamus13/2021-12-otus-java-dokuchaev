package ru.otus.homework;

import java.util.Set;

public class Application {
    public static void main(String... args) {

        Set<Currency> currencies = Set.of(
                new Currency(new Dollar(3_500), new Euro(2_050), new Ruble(10_550))
        );

        currencies.forEach(System.out::println);
        System.out.println("------------------------------------");

        Atm atm = new AtmTinkoff();
        Currency atmMoney = null;
        for (Currency currency : currencies) {
            atmMoney = atm.getMoney(currency);
        }
        System.out.println("atmMoney = " + atmMoney);
    }
}