package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;

public class CellFifty {

    private final List<Banknote> banknotes = new ArrayList<>();

    public List<Banknote> getBanknoteFifty() {
        return banknotes;
    }

    public void addBanknoteFifty() {
        banknotes.add(Banknote.FIFTY);
    }
}
