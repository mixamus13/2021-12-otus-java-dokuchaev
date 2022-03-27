package ru.otus.homework;

import java.util.List;

public class Atm {

    private final CellTen cellTen = new CellTen();
    private final CellTwenty cellTwenty = new CellTwenty();
    private final CellFifty cellFifty = new CellFifty();
    private final CellHundred cellHundred = new CellHundred();

    public void addCellTen() {
        cellTen.addBanknoteTen();
    }

    public List<Banknote> getCellTens() {
        return cellTen.getBanknoteTens();
    }

    public void addCellTwenty() {
        cellTwenty.addBanknoteTwenty();
    }

    public List<Banknote> getCellTwenties() {
        return cellTwenty.getBanknoteTwenties();
    }

    public void addCellFifties() {
        cellFifty.addBanknoteFifty();
    }

    public List<Banknote> getCellFifties() {
        return cellFifty.getBanknoteFifties();
    }

    public void addCellHundred() {
        cellHundred.addBanknoteHundred();
    }

    public List<Banknote> getCellHundreds() {
        return cellHundred.getBanknoteHundreds();
    }
}

