package ru.otus.homework;

public class AtmImpl implements Atm {

    @Override
    public int getMoney(Money money) {
        return money.getNominal();
    }

    @Override
    public int giveMoney(Money money) {
        return money.getNominal();
    }
}
