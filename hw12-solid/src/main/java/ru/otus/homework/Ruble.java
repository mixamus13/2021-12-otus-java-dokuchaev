package ru.otus.homework;

public class Ruble implements Curency {

    private final Double banknote;

    public Ruble(Double banknote) {
        this.banknote = banknote;
    }

    @Override
    public Double getBanknote() {
        return banknote;
    }
}
