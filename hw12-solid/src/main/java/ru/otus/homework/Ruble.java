package ru.otus.homework;

public class Ruble {

    private final int banknote;

    public Ruble(int banknote) {
        this.banknote = banknote;
    }

    public int getBanknote() {
        return banknote;
    }

    @Override
    public String toString() {
        return "" + banknote;
    }
}
