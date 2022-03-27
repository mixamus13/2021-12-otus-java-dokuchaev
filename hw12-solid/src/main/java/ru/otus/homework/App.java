package ru.otus.homework;

public class App {

    public static void main(String... args) {

        Atm atm = new Atm();

        atm.addCellTens();
        atm.addCellTens();

        atm.addCellTwenties();

        atm.addCellFifties();
        atm.addCellFifties();

        atm.addCellHundreds();
        atm.addCellHundreds();
        atm.addCellHundreds();
        atm.addCellHundreds();
        atm.addCellHundreds();

        System.out.println("banknote 10$  = "
                + atm.getCellTens().stream().map(CellTen::getBanknoteTen).toList());
        System.out.println("banknote 20$  = "
                + atm.getCellTwenties().stream().map(CellTwenty::getBanknoteTwenty).toList());
        System.out.println("banknote 50$ = "
                + atm.getCellFifties().stream().map(CellFifty::getBanknoteFifty).toList());
        System.out.println("banknote 100$ = "
                + atm.getCellHundreds().stream().map(CellHundred::getBanknoteHundred).toList());
    }
}
