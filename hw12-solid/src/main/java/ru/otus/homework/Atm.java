package ru.otus.homework;

import java.util.List;

public interface Atm {

    void addCellTen();
    List<Banknote> getCellTens();
    void addCellTwenty();
    List<Banknote> getCellTwenties();
    void addCellFifties();
    List<Banknote> getCellFifties();
    void addCellHundred();
    List<Banknote> getCellHundreds();
}
