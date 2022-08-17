package pl.cyber.trainees.kalkulator;

import java.math.BigDecimal;

public class Calculator {

    private final Dodawanie dodawanie;

    private final Mnozenie mnozenie;

    private final Odejmowanie odejmowanie;

    private final Dzielenie dzielenie;


    public Calculator (final Dodawanie dodawanie, final Mnozenie mnozenie, final Odejmowanie odejmowanie, final Dzielenie dzielenie) {
    this.dodawanie = dodawanie;
    this.mnozenie = mnozenie;
    this.odejmowanie = odejmowanie;
    this.dzielenie = dzielenie;
    }

    public void printData(){
        String valString1 = "string nr1";
        String valString2 = new String("String nr2");

        Integer valInt1 = 3;
        Integer valInt2 = Integer.valueOf("2");

        System.out.println("dodawanie: " + Dodawanie.add(valInt1, valInt2) + ", odejmowanie: " + Odejmowanie.subtract(valInt1, valInt2) + ", mnożenie: " + Mnozenie.multiplication(valInt1, valInt2) + ", dzielenie: " + Dzielenie.division(valInt1, valInt2));


        Double valDouble1 = 10.5;
        Double valDouble2 = Double.valueOf("4.5");

        System.out.println("dodawanie: " + Dodawanie.add(valDouble1, valDouble2) + ", odejmowanie: " + Odejmowanie.subtract(valDouble1, valDouble2) + ", mnożenie: " + Mnozenie.multiplication(valDouble1, valDouble2) + ", dzielenie: " + Dzielenie.division(valDouble1, valDouble2));


        BigDecimal valBigDecimal1 = BigDecimal.valueOf(10.5);
        BigDecimal valBigDecimal2 = new BigDecimal("4.5");



        System.out.println("dodawanie: " + Dodawanie.add(valBigDecimal1, valBigDecimal2) + ", odejmowanie: " + Odejmowanie.subtract(valBigDecimal1, valBigDecimal2) + ", mnożenie: " + Mnozenie.multiplication(valBigDecimal1, valBigDecimal2) + ", dzielenie: " + Dzielenie.division(valBigDecimal1, valBigDecimal2));

        System.out.println("Dzielenie przez 0: " + Dzielenie.divisionByZero(valDouble1, 0.0));
        System.out.println("Dzielenie przez 0: " + Dzielenie.divisionByZero(valBigDecimal1, BigDecimal.ZERO));
    }
}
