package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;

public class CellTen {

    private final List<Banknote> banknotes = new ArrayList<>();

    public List<Banknote> getBanknoteTen() {
        return banknotes;
    }

    public void addBanknoteTen() {
        banknotes.add(Banknote.TEN);
    }
}
