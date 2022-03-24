package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    List<Banknote> banknotes = new ArrayList<>();

    public void addBanknoteTen(Banknote banknote) {
        banknotes.add(banknote);
    }

    public void addBanknoteTwenty(Banknote banknote) {
        banknotes.add(banknote);
    }

    public void addBanknoteFifty(Banknote banknote) {
        banknotes.add(banknote);
    }

    public void addBanknoteHundred(Banknote banknote) {
        banknotes.add(banknote);
    }

    public List<Banknote> getBanknote() {
        return new ArrayList<>(banknotes);
    }
}
