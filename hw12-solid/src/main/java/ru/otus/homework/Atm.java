package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;

public class Atm {

    private final List<CellTen> cellTens = new ArrayList<>();
    private final List<CellTwenty> cellTwenties = new ArrayList<>();
    private final List<CellFifty> cellFifties = new ArrayList<>();
    private final List<CellHundred> cellHundreds = new ArrayList<>();

    public List<CellTen> getCellTens() {
        return cellTens;
    }

    public void addCellTens() {
        var cellTen = new CellTen();
        cellTen.addBanknoteTen();
        cellTens.add(cellTen);
    }

    public List<CellTwenty> getCellTwenties() {
        return cellTwenties;
    }

    public void addCellTwenties() {
        var cellTwenty = new CellTwenty();
        cellTwenty.addBanknoteTwenty();
        cellTwenties.add(cellTwenty);
    }

    public List<CellFifty> getCellFifties() {
        return cellFifties;
    }

    public void addCellFifties() {
        var cellFifty = new CellFifty();
        cellFifty.addBanknoteFifty();
        cellFifties.add(cellFifty);
    }

    public List<CellHundred> getCellHundreds() {
        return cellHundreds;
    }

    public void addCellHundreds() {
        var cellHundred = new CellHundred();
        cellHundred.addBanknoteHundred();
        cellHundreds.add(cellHundred);
    }
}

