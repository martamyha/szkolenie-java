package pl.cyber.trainees.wyjasnienia;

import java.math.BigDecimal;

public class SimpleAppMarta {
    enum Stan {on,off};
    enum Plec {kobieta,mezczyzna};
    public static void main(String[] args) {

        int wartoscBoolean = 0; // Ta zmienna może przyjmowac wartości 1 lub 0
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


        int intValue5 = 4000000;
        Integer integerValue3 = 4000000;
        Integer integerValue2 = Integer.valueOf(40000000);
        Integer integerValue4 = Integer.parseInt(String.valueOf(4000000));

        System.out.println("Integer value: " + integerValue3);
        System.out.println("Integer value: " + integerValue2);
        System.out.println("Integer value: " + integerValue4);

        boolean boolValue = false;
        Boolean boolVal1 = Boolean.FALSE; // Boolean.TRUE;
      // można to też zapisać jako boolen BooVal2 = true;
        Boolean boolVal2 = Boolean.valueOf("true");

        System.out.println("Bootlean value: " + boolVal1);
        System.out.println("Bootlean value: " + boolVal2);

        boolean boolValue4;
        if ( wartoscBoolean == 1) {
            boolValue4 = true;
        } else {
            boolValue4 = false;
        }
        System.out.println(boolValue4);

        Double cenaDouble = 12.3;
        Long cenaInt = Math.round(cenaDouble);

        System.out.println(cenaInt);

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
