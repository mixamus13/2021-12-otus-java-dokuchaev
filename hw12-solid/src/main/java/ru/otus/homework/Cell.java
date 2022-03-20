package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    private final Banknote banknote;
    private final List<Banknote> banknotes;

    public Cell(Banknote banknote) {
        this.banknote = banknote;
        this.banknotes = new ArrayList<>();
    }

    public List<Banknote> getBanknotes() {
       return banknotes.addAll(banknote);
    }
}
