package pl.cyber.trainees;

import pl.cyber.trainees.kalkulator.Dodawanie;
import pl.cyber.trainees.kalkulator.Dzielenie;
import pl.cyber.trainees.kalkulator.Mnozenie;
import pl.cyber.trainees.kalkulator.Odejmowanie;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleApp {

    enum Stan {on, off};
    enum Plec {kobieta, mezczyzna};
    public static void main(String[] args) {
        int scale = 0;

        roundNumber("2.34", scale);
        System.out.println("NEXT");
        roundNumber("2.44", scale);
        System.out.println("NEXT");
        roundNumber("2.46", scale);
        System.out.println("NEXT");
        roundNumber("2.5", scale);
        System.out.println("NEXT");
        roundNumber("2.55", scale);
        System.out.println("NEXT");
        roundNumber("2.6", scale);
        System.out.println("NEXT");
    }
    public static int add(int l1, int l2) {
        var result = l1 + l2;
        return result;
        // return l1 + l2;
    }
    public static String concat(String l1, String l2) {
        var result = l1 + l2 + "\n";
        return result;
    }
    public static void roundNumber(final String number, int scale) {  //To najczęstszy sposób gdzie ja stosuję zaokrąglanie liczb
        BigDecimal value = BigDecimal.valueOf(Double.parseDouble(number));
        var roundHalfUp = value;
        roundHalfUp = roundHalfUp.setScale(scale, RoundingMode.UP);

        var roundHalfDown = value;
        roundHalfDown = roundHalfDown.setScale(scale, RoundingMode.DOWN);

        var roundHalfFloor = value;
        roundHalfUp = roundHalfUp.setScale(scale, RoundingMode.FLOOR);

        System.out.println("Round Half up: " + roundHalfUp);
        System.out.println("Round Half down: " + roundHalfDown);
        System.out.println("Round Half floor: " + roundHalfFloor);
    }
    // testowa zmiana
}
