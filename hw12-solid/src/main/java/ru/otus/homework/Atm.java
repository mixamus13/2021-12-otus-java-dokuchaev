package ru.otus.homework;

public interface Atm {
    Currency getMoney(Currency currency);
    Currency giveMoney(Currency currency);
}
