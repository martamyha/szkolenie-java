package pl.cyber.trainees.kalkulator;
import java.math.BigDecimal;
import java.util.List;
public class Dodawanie {
    public static int add(int l1, int l2) {
        var result = l1 + l2;
        return result;
    }
    public static String add(final String val, final String val2) {
        var result = val + val2 + "\n";
        return result;
    }
    public static Integer add(final Integer val, final Integer val2) {return val + val2; }

    public static Double add(final Double val, final Double val2) { return val + val2; }

    public static BigDecimal add(final BigDecimal val, BigDecimal val2) {return val.add(val2); }

    public static void dodawanieList(List<Double> lista) {
        Double result = 0.0;

        for (Double element : lista) {
            System.out.println("Teraz wykonuję operację: " + element + " + " + result);
            result = add(result, element);
//          result = result + element;
        }
        System.out.println("Wynik dodawania listy: " + result);
    }


}
