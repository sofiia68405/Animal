package com.company;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal CenaNetto = new BigDecimal("9.99");
        BigDecimal StawkaVAT = new BigDecimal("0.23");
        BigDecimal CenaBrutto = CenaNetto.multiply(BigDecimal.ONE.add(StawkaVAT));
        BigDecimal WartośćBruttoDla10000 = CenaBrutto.multiply(new BigDecimal("10000"));
        BigDecimal WartośćNettoDla10000 = CenaNetto.multiply(new BigDecimal("10000"));
        BigDecimal vatValueFor10000 = WartośćBruttoDla10000.subtract(WartośćNettoDla10000);

        System.out.println("Cena Brutto: " + CenaBrutto);
        System.out.println("Wartość Brutto dla 10000 sztuk: " + WartośćBruttoDla10000);
        System.out.println("Wartość Netto dla 10000 sztuk: " + WartośćNettoDla10000);
        System.out.println("Wartość VAT dla 10000 sztuk: " + vatValueFor10000);
    }
}
