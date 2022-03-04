package ru.otus.homework;

public class Currency {

   private final Dollar dollar;
   private final Euro euro;
   private final Ruble ruble;

   public Currency(Dollar dollar, Euro euro, Ruble ruble) {
      this.dollar = dollar;
      this.euro = euro;
      this.ruble = ruble;
   }

   public Dollar getDollar() {
      return dollar;
   }

   public Euro getEuro() {
      return euro;
   }

   public Ruble getRuble() {
      return ruble;
   }

   @Override
   public String toString() {
      return "Currency{" +
              "dollar=" + dollar +
              ", euro=" + euro +
              ", ruble=" + ruble +
              '}';
   }
}
