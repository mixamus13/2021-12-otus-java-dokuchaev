package ru.otus.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CellFifty implements Cell {

    private final List<Banknote> banknoteList = new ArrayList<>();
    private final Banknote banknote = Banknote.FIFTY;

    @Override
    public void addBanknote() {
        banknoteList.add(banknote);
    }

    @Override
    public List<Banknote> getBanknote() {
        banknoteList.add(banknote);
        return Collections.unmodifiableList(banknoteList);
    }
}
