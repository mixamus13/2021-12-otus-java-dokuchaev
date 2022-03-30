package ru.otus.homework;

public class App {

    public static void main(String... args) {

        AtmTinkoff atmTinkoff = new AtmTinkoff();

        atmTinkoff.addCellTen();
        atmTinkoff.addCellTen();

        atmTinkoff.addCellTwenty();

        atmTinkoff.addCellFifties();
        atmTinkoff.addCellFifties();

        atmTinkoff.addCellHundred();
        atmTinkoff.addCellHundred();
        atmTinkoff.addCellHundred();
        atmTinkoff.addCellHundred();
        atmTinkoff.addCellHundred();

        System.out.println("banknote 10$  = " + atmTinkoff.getCellTens());
        System.out.println("banknote 20$  = " + atmTinkoff.getCellTwenties());
        System.out.println("banknote 50$ = " + atmTinkoff.getCellFifties());
        System.out.println("banknote 100$ = " + atmTinkoff.getCellHundreds());
    }
}
