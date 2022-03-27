package ru.otus.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CellTwenty {

    private final List<Banknote> banknoteList = new ArrayList<>();
    private final Banknote banknote = Banknote.TWENTY;

    public void addBanknoteTwenty() {
        banknoteList.add(banknote);
    }

    public List<Banknote> getBanknoteTwenties() {
        banknoteList.add(banknote);
        return Collections.unmodifiableList(banknoteList);
    }
}
