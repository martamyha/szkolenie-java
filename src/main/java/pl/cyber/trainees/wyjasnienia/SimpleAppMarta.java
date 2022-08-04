package pl.cyber.trainees.wyjasnienia;

import java.math.BigDecimal;

public class SimpleAppMarta {
    enum Stan {on,off};
    enum Plec {kobieta,mezczyzna};
    public static void main(String[] args) {
        String tekst = "";
        BigDecimal value = BigDecimal.valueOf(1) ;
        BigDecimal value1 = BigDecimal.ONE;
        System.out.println("My first Application");
        System.out.println("Get BigDecimal value:" +  value + " value1 " + value1);

        int intValue = 4000000;
        int intValueB = intValue + 1000;
        System.out.println(intValue);
        System.out.println(intValue+100);
        System.out.println(intValueB);

        double doubleValue = 2.0;
        System.out.println(doubleValue);

        char znak = 'a';
        char[] tabZnaków = {'\u0043','a',};

        System.out.println("add: " + add(1, 3));
        System.out.println("add: " + concat("Jan", "Nowak"));

        System.out.println("\nLiterały i\tznaki specjalne");
        System.out.println("\'Literały\' i \"znaki\" specjalne \\");

    }

    public static int add(int l1, int l2) {
       var result = l1 + l2;
       return result;
    }

    public static String concat(String l1, String l2) {
        var result = l1 + l2;
        return result;
    }
}
