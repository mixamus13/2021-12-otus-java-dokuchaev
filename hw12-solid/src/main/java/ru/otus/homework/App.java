package ru.otus.homework;

import java.util.Arrays;

public class App {

    public static void main(String... args) {

        System.out.println("------------------------------------------");
        Nominal[] nominals = Nominal.values();
        System.out.println("nominals = " + Arrays.toString(nominals));

        System.out.println("------------------------------------------");
        Banknote banknote = new Banknote(Nominal.FIFTY);
        System.out.println("banknote.getNominal() = " + banknote.getNominal());

        System.out.println("------------------------------------------");
        Cell cell = new Cell(new Banknote(Nominal.HUNDRED));
        cell.getBanknotes();
        System.out.println("cell = " + cell);
    }
}
