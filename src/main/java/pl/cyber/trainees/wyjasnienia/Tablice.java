package pl.cyber.trainees.wyjasnienia;
// DO NADROBIENIA
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Mariusz Tański
 */

public class Tablice {

  /*
  Tworzenie tablic jednowymiarowych w Java
  TypDanych[] nazwa_tablicy = new TypDanych[(int) zakres_tablicy];

  np.
  Integer[] tablicaInt = new Integer[10];

  Integer[] nowaTablica = {1, 2, 3, 4, 19};

  Zalecana forma:
  Integer[] nowaTablica = new Integer[5];
  nowaTablica[0] = 1;
  nowaTablica[1] = 2;
  nowaTablica[2] = 3;
  nowaTablica[3] = 4;
  nowaTablica[4] = 19;
   */
  /*
  Tworzenie tablic wielowymiarowych w Java
  TypDanych[][] nazwa_tablicy = new TypDanych[(int) zakres_tablicy1][zakres_tablicy2];
  Integer[][] tablicaInt = new Integer[10][10];

  Integer[][] nowaTablica = new Integer[1][1];
  nowaTablica[A][1] = 1;
  nowaTablica[0][1] = 1;
  nowaTablica[1][0] = 1;
  nowaTablica[1][1] = 1;
   */

  /*
  odwołanie się do tablic
  System.out.println(nowaTablica[0]);
  System.out.println(nowaTablica[0][0]);
   */
  /*
  Częsty błąd przy tablicach:
  ArrayIndexOutOfBoundsException - Przekroczenie wielkości tablicy
  Integer[] tablicaInt = new Integer[10];
  tablicaInt[11] = 2;
   */

    public void uruchom() {
        tablicaWielowymiarowa();
    }

    //zadanie 1
    //Utworzyć tablicę o wymiarze 5 elementów i przypisać do niej 'randomowe' wartości
    //Następnie proszę o wyświetlenie wszystkich elementów tablicy (tak działa while oraz for)


    private void wyswietlTablice() {
        Integer[] tablica1 = new Integer[5];
        tablica1[0] = 2;
        tablica1[1] = 3;
        tablica1[2] = 3;
        tablica1[3] = 5;
        tablica1[4] = 5;

        System.out.println("While");
        int n = 0;
        while (n < tablica1.length) {
            System.out.println(tablica1[n]);
            n++;
        }

        for (int i=0 ; i<tablica1.length; i++) {

            System.out.println(tablica1[i]);
        }

        for (Integer element :
                tablica1) {
            System.out.println(element);
        }
    }

    //zadanie 2
    //Utworzyć tablicę o wymiarze 15 elementów i przypisać do niej 'randomowe' wartości
    //przy użyciu objektu Random z zakresu od 50 do 200
    //Następnie proszę o wyświetlenie wszystkich elementów tablicy (tak działa while oraz for)

    private void wyswietlTabliceZRandom() {
        Integer[] tablica1 = new Integer[5];

        Random rand = new Random();

        //użyć wystarczy rand.nextInt();
        // rand.nextInt(liczba);
        // rand.nextInt(200); -> losowanie liczb z zakresu 0 - 200
        // rand.nextInt(150)+50; -> losowanie liczb z zakresu 50 - 200
        // rand.nextInt(KoniecZakresu-PoczątekZakresu)+Początek zakresu;

        for (int i=0; i<tablica1.length; i++){
            tablica1[i] = rand.nextInt(150)+50;
        }

        for (Integer element :
                tablica1) {
            System.out.println(element);
        }
    }

    //Zadanie 3
    //Zadanie 2 przerobić w taki spobób aby tablicę zastąpić listą
    private void wyswietlListeZRandom() {

        List<Integer> tablica1 = new ArrayList<>();
        Random rand = new Random();
/*

Przypisanie wielu wartości do tablicy
    for (int i=0; i<tablica1.length; i++){
      tablica1[i] = rand.nextInt(150)+50;
    }

Przypisanie wielu wartości do listy

  for (int i=0; i<5; i++){
    tablica1.add(rand.nextInt(150)+50);
  }
 */
        for (int i=0; i<5; i++){
            tablica1.add(rand.nextInt(150)+50);
        }

        for (Integer element :
                tablica1) {
            System.out.println(element);
        }

    }


    //Zadanie 4
    //na przykładzie powyższych zadań utworzyć tablicę wielowymiarową 10x10
    // i wypełnić losowymi danymi

    private void tablicaWielowymiarowa() {
        Integer[][] tablica1 = new Integer[10][10];
        Random rand = new Random();

        for (int i =0; i<tablica1.length; i++) {
            for (int j =0; j<tablica1.length; j++ ){
                tablica1[i][j] = rand.nextInt(150)+50;
            }
        }

        for (int i =0; i<tablica1.length; i++) {
            for (int j =0; j<tablica1.length; j++ ){
                System.out.println(tablica1[i][j]);
            }
        }


    }


}
