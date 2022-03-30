package ru.otus.homework;

public enum Banknote {

    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    private final int amount;

    Banknote(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Banknote = " + amount + "$";
    }
}
