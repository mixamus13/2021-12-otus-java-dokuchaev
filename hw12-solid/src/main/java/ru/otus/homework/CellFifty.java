package ru.otus.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CellFifty {

    private final List<Banknote> banknoteList = new ArrayList<>();
    private final Banknote banknote = Banknote.FIFTY;

    public void addBanknoteFifty() {
        banknoteList.add(banknote);
    }

    public List<Banknote> getBanknoteFifties() {
        banknoteList.add(banknote);
        return Collections.unmodifiableList(banknoteList);
    }
}
