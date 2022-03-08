package ru.otus.homework;

public class Euro implements Curency {

    private final Double banknote;

    public Euro(Double banknote) {
        this.banknote = banknote;
    }

    @Override
    public Double getBanknote() {
        return banknote;
    }
}
