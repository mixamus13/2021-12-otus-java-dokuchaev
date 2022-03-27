package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;

public class CellTwenty {

    private final List<Banknote> banknotes = new ArrayList<>();

    public List<Banknote> getBanknoteTwenty() {
        return banknotes;
    }

    public void addBanknoteTwenty() {
        banknotes.add(Banknote.TWENTY);
    }
}
