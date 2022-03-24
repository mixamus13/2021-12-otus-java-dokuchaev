package ru.otus.homework;

import java.util.List;

public class App {

    public static void main(String... args) {

        Atm atm = new Atm();
        atm.addBanknote(Banknote.TEN);
        atm.addBanknote(Banknote.HUNDRED);
        List<Banknote> banknote = atm.getBanknote();
        System.out.println("banknote = " + banknote);

    }
}
