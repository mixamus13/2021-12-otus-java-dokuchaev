package ru.otus.homework;

public class App {

    public static void main(String... args) {

        Atm atm = new Atm();

        atm.addCellTen();
        atm.addCellTen();

        atm.addCellTwenty();

        atm.addCellFifties();
        atm.addCellFifties();

        atm.addCellHundred();
        atm.addCellHundred();
        atm.addCellHundred();
        atm.addCellHundred();
        atm.addCellHundred();

        System.out.println("banknote 10$  = " + atm.getCellTens());
        System.out.println("banknote 20$  = " + atm.getCellTwenties());
        System.out.println("banknote 50$ = " + atm.getCellFifties());
        System.out.println("banknote 100$ = " + atm.getCellHundreds());
    }
}
