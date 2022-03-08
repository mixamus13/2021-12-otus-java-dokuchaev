package ru.otus.homework;

public class AtmTinkoff implements Atm {

    @Override
    public Double getMoney(Curency sum) {
        Double sumBanknote = sum.getBanknote();
        return Double.sum(sumBanknote, sumBanknote);
    }

    @Override
    public Double giveMoney(Curency sum) {
        Double sumBanknote = sum.getBanknote();
        return sumBanknote -= sumBanknote;
    }
}
