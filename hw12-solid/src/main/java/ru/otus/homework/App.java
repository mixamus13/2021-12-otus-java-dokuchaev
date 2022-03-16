package ru.otus.homework;

public class App {

    public static void main(String... args) {

        Atm tinkoff = new AtmTinkoff();

        Double hundred = tinkoff.inMoney(Dollar.HUNDRED);
        System.out.println("inMoney = " + hundred);

        Double fifteen = tinkoff.inMoney(Dollar.FIFTEEN);
        System.out.println("fifteen = " + fifteen);

        Dollar usdOne = Dollar.FIFTEEN;
        System.out.println("outMoney = " + tinkoff.outMoney(usdOne));
    }
}
