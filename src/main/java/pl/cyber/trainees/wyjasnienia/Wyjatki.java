package pl.cyber.trainees.wyjasnienia;
//do nadrobienia
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Mariusz Tański
 */

public class Wyjatki {

//  IndexOutOfBoundsException
//  IOException
//  IllegalArgumentException

    // throw

    //Wywołanie (rzucenie) wyjątku w kodzie
    //throw new IOException();


    //mamy dostępne 2 rodzeje wyjątków chacked i unchecked
  /*
  Wyjątki checked musimy obsłużyć inaczej program się nie skompiluje oraz nie uruchomi.
  Przykładem wyjątku checked jest wyjątek IOException, ponieważ dziedziczy (extends) on po klasie Exception.
  Tego typu wyjątek i wiele mu podobnych musimy zawsze obsłużyć


  Wyjątki typu unchecked to są wyjątki 'niezagrażające działaniu aplikacji'. To znaczy, że w ciągu działania aplikacji
  może zostać on rzucony natomiast aplikacja będzie działała niezależnie od niego.
  Przykładem wyjątku unchecked jest IndexOutOfBoundsException, ponieważ dziedziczy (extends) po klasie RuntimeException
   */

  /*
  Obsługa wyjątków.
  poprzez słowo kluczowe throws, które zwykle piszemy po deklaracji metody a przed nawiasem { otwierającym metode.
  np.
  private void dzielenieLiczb(Integer a, Integer b) throws IOException {

  Dzięki słowu throws nasz wyjątek zostanie przekazany do metody wyżej, jeśli będzie ta konstrukcja użyta przy metodzie main
  to wtedy nasz wyjątek checked zostanie wyświetlony w konsoli.

  StackTrace - czyli wyświetlone informacje o wyjątku dostępne z konsoli.
   */


    private void dzielenieLiczb() throws IOException {
        // Użycie Scanner aby pobrać 2 zmienne od Użytkownika
        // I wykonać działanie dzielenia liczb.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę: ");
        Integer a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę: ");
        Integer b = scanner.nextInt();

        System.out.println("Wynik dzielenia: " + a/b);
        //throw powoduje rzucenie wyjątku. Dzięki temu możemy rzucić dowolnym wyjątkiem w dowolnym momencie aplikacji
//    throw new IOException("test");

    }

  /*
  Obsługa wyjątków w zalecany sposób

  Używamy konstrukcji try / catch

  try {
 //w tym miejscu powinien być kod, który może generować jakiś Exception
    throw new IOException("test");
  } catch(IOException ex) {
  // konstrukcja obsługi błędu. W tym miejscu np podajemy informację na konsolę ewentualnie możemy wykonać inne działania
    System.out.println("wiadomość");
  }

  try {
  System.out.println("Wynik dzielenia: " + a/b);
  } catch (ArithmeticException ex) {

  System.out.println("Niedozwolona operacja dzielenia przez 0. Zostanie wykonane dzielenie przez 1.");
  System.out.println("Wynik dzielenia: " + a/1);

  }
   */

    private void dzielenieLiczb2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę: ");
        Integer a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę: ");
        Integer b = scanner.nextInt();


        try {
            System.out.println("Wynik dzielenia: " + a/b);
        } catch (ArithmeticException ex) {

//      System.out.println("Niedozwolona operacja dzielenia przez 0. Zostanie zwrócona wartość 0.");
//      System.out.println("Wynik dzielenia: " + 0);

            System.out.println("Niedozwolona operacja dzielenia przez 0. Użytkownik podał a: " + a + " b: " + b);

        }


        try {
            throw new IllegalArgumentException("src/main/test");
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException thrown");
        }
        finally {
            System.out.println("to jest finally!!!");
        }

//    try {
//      System.out.println("Wynik dzielenia: " + a/b);
//
//    } catch(ArithmeticException ex) {
//      System.out.println("ArithmeticException!!!");
//    } catch(IllegalArgumentException ex) {
//      System.out.println("Podaj poprawne informacje!!!");
//    } catch(RuntimeException ex) {
//      System.out.println("Ojej !!!");
//    } catch(Exception ex) {
//      System.out.println("Coś się stało!!!");
//    }

//    try {
//
//    } catch(ArithmeticException | IllegalArgumentException ex) {
//      System.out.println("Podaj poprawne informacje!!!");
//    }
    }

  /*
  Rozwiniecie konstrukcji try / catch

  try {

  } catch(ArithmeticException ex) {

  } catch(IllegalArgumentException ex) {
    println("Podaj poprawne informacje!!!");
  } catch(RuntimeException ex) {
    println("Ojej !!!");
  } catch(Exception ex) {
     println("Coś się stało!!!");
  }

  Wyjątki obsługujemy od szczegółu do ogółu tzn ArithmeticException -> RuntimeException -> Exception

  Catch można parametryzować do wielu wyjątków.
  Catch można grupować tzn kilka 'obsłużeń' wyjątków zawęzić do jednego bloku catch

try {

  } catch(ArithmeticException | IllegalArgumentException | RuntimeException | Exception ex) {
    println("Podaj poprawne informacje!!!");
  }

  try {

  } finally {
      System.out.println("to jest finally!!!");
  }

   */

  /*
  Dobre praktyki przy używaniu wyjątków

 1) Blok try powinien mieć jak najmniej kodu do weryfikacji
 2) Powinniśmy używać szczegółowych wyjątków tj. np. IllegalArgumentException zamiast Exception
 3) W bloku catch należy podać najbardziej szczegółowe informacje o problemie z ich opisem.
 4) Powinniśmy używać wyjątków typu checked
   */

    //Zadanie2
    //Utworzyć metodę która pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
//  Jeśli użytkownik poda liczbę ujemną to należy rzucić IllegalArgumentException oraz obsłużyć sytuację w której użytkownik
    // poda ciąg znaków, który nie jest liczbą.

    private void pierwiastek() {
        Scanner scan = new Scanner(System.in);
        Integer liczba = null;
        try {
            liczba = scan.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Została podana inna wartość niż liczba!!");
            liczba = 0;
        }

        if(liczba < 0) {
            throw new IllegalArgumentException("Została podana liczba ujemna!");
        }

        System.out.println("Pierwiastek liczby " + liczba + " to: " + Math.sqrt(liczba));
    }

    private void pierwiastekAlternatywa() {
        Scanner scan = new Scanner(System.in);
        String liczba = scan.next();

        try {
            if ("".equals(liczba) || Integer.parseInt(liczba) < 0) {
                throw new IllegalArgumentException("Została podana liczba ujemna!");
            }
        } catch (NumberFormatException e) {
            System.out.println(" Get Message: " + e.getMessage());
            System.out.println(" Get StackTrace: " );
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
            System.out.println();
            throw new IllegalArgumentException("Została podana inna wartość niż liczbowa jej wartość: " + liczba );
        }
        System.out.println("Pierwiastek liczby " + liczba + " to: " + Math.sqrt(Integer.parseInt(liczba)));
    }

    //Zadanie 3
    //Przekaż do tej metody null i zobacz, jaki wyjątek został zgłoszony.
    //metoda powinna przyjąc parametr oraz zwrócić wartość
    //przekazały String a returnem string.length()


    //Zadanie 4
    //Rozwinięcie zadania 3
    // obsłużenie tego wyjątku

    public void uruchom() throws IOException {
        pierwiastekAlternatywa();
    }
}
