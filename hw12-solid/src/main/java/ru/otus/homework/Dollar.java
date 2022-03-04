package ru.otus.homework;

public class Dollar {

    private final int banknote;

    public Dollar(int banknote) {
        this.banknote = banknote;
    }

    public int getBanknote() {
        return banknote;
    }

    @Override
    public String toString() {
        return "Dollar{" +
                "banknote=" + banknote +
                '}';
    }
}
