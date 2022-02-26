package ru.otus.homework;

public class Application {
    public static void main(String... args) {
        Atm atm = new AtmImpl();
        int money = atm.getMoney(new Money(100));
        System.out.println("money = " + money);
    }
}
