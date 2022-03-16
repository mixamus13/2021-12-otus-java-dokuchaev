package ru.otus.homework;

public enum Dollar implements Curency {

    TEN(10.00),
    TWENTY(20.00),
    FIFTEEN(50.00),
    HUNDRED(100.00);

    private final double nominal;

    Dollar(double nominal) {
        this.nominal = nominal;
    }

    @Override
    public Double getBanknote() {
        return nominal;
    }
}
