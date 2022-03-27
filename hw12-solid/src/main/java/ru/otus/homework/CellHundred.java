package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;

public class CellHundred {

    private final List<Banknote> banknotes = new ArrayList<>();

    public List<Banknote> getBanknoteHundred() {
        return banknotes;
    }

    public void addBanknoteHundred() {
        banknotes.add(Banknote.HUNDRED);
    }
}
