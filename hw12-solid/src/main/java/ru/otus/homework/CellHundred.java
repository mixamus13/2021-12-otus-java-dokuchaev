package ru.otus.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CellHundred {

    private final List<Banknote> banknoteList = new ArrayList<>();
    private final Banknote banknote = Banknote.HUNDRED;

    public void addBanknoteHundred() {
        banknoteList.add(banknote);
    }

    public List<Banknote> getBanknoteHundreds() {
        banknoteList.add(banknote);
        return Collections.unmodifiableList(banknoteList);
    }
}
