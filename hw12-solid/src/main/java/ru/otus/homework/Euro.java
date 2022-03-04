package ru.otus.homework;

public class Euro {

    private final int banknote;

    public Euro(int banknote) {
        this.banknote = banknote;
    }

    public int getBanknote() {
        return banknote;
    }

    @Override
    public String toString() {
        return "Euro{" +
                "banknote=" + banknote +
                '}';
    }
}
