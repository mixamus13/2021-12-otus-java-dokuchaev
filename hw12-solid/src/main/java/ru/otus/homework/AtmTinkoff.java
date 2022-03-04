package ru.otus.homework;

public class AtmTinkoff implements Atm {

    @Override
    public Currency getMoney(Currency currency) {
        return currency;
    }

    @Override
    public Currency giveMoney(Currency currency) {
        return currency;
    }
}
