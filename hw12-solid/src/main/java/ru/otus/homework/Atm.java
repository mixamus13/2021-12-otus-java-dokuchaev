package ru.otus.homework;

import java.util.List;

public class Atm {

    private final Cell cell = new Cell();

    public List<Banknote> getBanknote() {
        return cell.getBanknote();
    }

    public void addBanknote(Banknote banknote) {
        switch (banknote.name()) {
            case "HUNDRED" -> cell.addBanknoteHundred(banknote);
            case "FIFTY" -> cell.addBanknoteFifty(banknote);
            case "TWENTY" -> cell.addBanknoteTwenty(banknote);
            case "TEN" -> cell.addBanknoteTen(banknote);
            default -> System.out.println("Banknote is empty");
        }
    }
}

