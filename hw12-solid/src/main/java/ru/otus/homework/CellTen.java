package ru.otus.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CellTen {

    private final List<Banknote> banknoteList = new ArrayList<>();
    private final Banknote banknote = Banknote.TEN;

    public void addBanknoteTen() {
        banknoteList.add(banknote);
    }

    public List<Banknote> getBanknoteTens() {
        banknoteList.add(banknote);
        return Collections.unmodifiableList(banknoteList);
    }
}
