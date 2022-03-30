package ru.otus.homework;

import java.util.List;

public class AtmTinkoff implements Atm {

    private final Cell cellTen = new CellTen(Banknote.TEN);
    private final Cell cellTwenty = new CellTwenty(Banknote.TWENTY);
    private final Cell cellFifty = new CellFifty(Banknote.FIFTY);
    private final Cell cellHundred = new CellHundred(Banknote.HUNDRED);

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

