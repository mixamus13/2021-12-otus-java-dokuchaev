package ru.otus.homework;

public enum Nominal {

    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    private final int amount;

    Nominal(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Nominal{" +
                "amount=" + amount +
                "} " + super.toString();
    }
}
