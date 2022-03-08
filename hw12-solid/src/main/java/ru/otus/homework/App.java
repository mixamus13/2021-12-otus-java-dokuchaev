package ru.otus.homework;

public class App {

    public static void main(String... args) {

        Curency usd = new Dollar(400.00);

        Curency euro = new Euro(550.00);
        Curency curency = new Ruble(55000.00);

        Atm tinkoff = new AtmTinkoff();
        Double money = tinkoff.getMoney(usd);
        System.out.println("money = " + money);

        Curency usdOne = new Dollar(200.00);
        System.out.println("tinkoff.giveMoney(usd) = " + tinkoff.giveMoney(usdOne));
    }
}
