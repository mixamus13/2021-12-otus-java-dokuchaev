package ru.otus.homework;

public class Banknote {

    private final Nominal nominal;

    public Banknote(Nominal nominal) {
        this.nominal = nominal;
    }

    public Nominal getNominal() {
        return nominal;
    }

    @Override
    public String toString() {
        return "Banknote{" +
                "nominal=" + nominal +
                '}';
    }
}
