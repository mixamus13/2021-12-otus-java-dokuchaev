package ru.otus.homework;

public class Dollar implements Curency {

    private final Double banknote;

    public Dollar(Double banknote) {
        this.banknote = banknote;
    }

    @Override
    public Double getBanknote() {
        return banknote;
    }
}
