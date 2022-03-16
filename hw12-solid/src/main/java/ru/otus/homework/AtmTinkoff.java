package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;

public class AtmTinkoff implements Atm {

    List<Double> dollars = new ArrayList<>();

    @Override
    public Double inMoney(Curency curency) {
        Double sum = 0.0;
        dollars.add(sum += curency.getBanknote());
        return sum;
    }

    @Override
    public Double outMoney(Curency curency) {
        Double sum = 0.0;
        dollars.add(sum -= curency.getBanknote());
        return sum;
    }
}
