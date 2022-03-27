package ru.otus.homework;

import java.util.List;

public class AtmTinkoff implements Atm {

    private final Cell cellTen = new CellTen();
    private final Cell cellTwenty = new CellTwenty();
    private final Cell cellFifty = new CellFifty();
    private final Cell cellHundred = new CellHundred();

    @Override
    public void addCellTen() {
        cellTen.addBanknote();
    }

    @Override
    public List<Banknote> getCellTens() {
        return cellTen.getBanknote();
    }

    @Override
    public void addCellTwenty() {
        cellTwenty.addBanknote();
    }

    @Override
    public List<Banknote> getCellTwenties() {
        return cellTwenty.getBanknote();
    }

    @Override
    public void addCellFifties() {
        cellFifty.addBanknote();
    }

    @Override
    public List<Banknote> getCellFifties() {
        return cellFifty.getBanknote();
    }

    @Override
    public void addCellHundred() {
        cellHundred.addBanknote();
    }

    @Override
    public List<Banknote> getCellHundreds() {
        return cellHundred.getBanknote();
    }
}

