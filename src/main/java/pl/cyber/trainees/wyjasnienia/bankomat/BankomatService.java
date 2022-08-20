package pl.cyber.trainees.wyjasnienia.bankomat;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BankomatService {

    Scanner scanUser = new Scanner(System.in);
    Bankomat bankomat = new Bankomat();



    private boolean menu(final Integer pozycja) {
        Integer kwota = 0;

    try {

        switch (pozycja) {
                    case 1:
                System.out.println("Wpłacam gotówkę");
                System.out.print("Proszę podać kwotę wpłaty: ");
                kwota = scanUser.nextInt();
                sprawdzWprowadzaneKwoty(kwota);

                bankomat.wplacGotowke(kwota);
                break;
            case 2:
                System.out.println("Wypłacam gotówkę");
                System.out.print("Proszę podać kwotę wypłaty: ");
                kwota = scanUser.nextInt();
                sprawdzWprowadzaneKwoty(kwota);

                bankomat.sprawdzWyplate(kwota);
                bankomat.wyplacGotowke(kwota);

                break;
            case 3:
                System.out.println("Stan konta");
                System.out.println("Bankomat posiada: " + bankomat.stanKonta());
                break;
        }
    } catch (InputMismatchException e) {
        throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłaty/wypłaty.");
    }

        return pozycja != 4;
    }
    private void sprawdzWprowadzaneKwoty(final Integer kwota) {
        List<Integer> lista = List.of(10,20,50,100,200,500);
        if(!lista.contains(kwota)) {
            // co mam robić jeśli kwota zawiera się w liście, jeśli mamy negacje, co odwracamy ifa
        throw new BusinessException("Wprowadź poprawną kwotę z zakresu " + lista);
        }
    }


    public void uruchomRozwiazanie1 () {

        boolean czyKontynuowac;

        do {

            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Przerwij Operację");

            Integer userInfo = 4;

            try {
                userInfo = scanUser.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby z menu.");
            }

            czyKontynuowac = menu(userInfo);

        } while (czyKontynuowac);
    }

    public void uruchomRozwiazanie2 () {

        List<Karta> karty = List.of(
                new Karta(12345678, 1111, 1000),
                new Karta(87654321, 1234, 2000)
        );

        boolean czyKontynuowac;
        boolean czyPrawidlowaKarta = false;
        Karta karta = null;

        System.out.println("Włóż kartę");
        Integer nrKarty = scanUser.nextInt();
        System.out.println("Wprowadź pin dla karty");
        Integer pinKarty = scanUser.nextInt();

        for (Karta el : karty) {
            if (el.getNrKarty().equals(nrKarty)) {
                el.sprawzPin(pinKarty);
                czyPrawidlowaKarta = true;
                karta = el;
            }
        }

        if (!czyPrawidlowaKarta || karta == null) {
            throw new BusinessException("Wprowadzono błędne dane karty.");
        }
//ALTERNATYWA W POSTACI WYKORZYSTANIA STRUMIENIA DANYCH
//        karta = karty.stream()
//                .filter(Objects::nonNull)
//                .filter(element -> element.getNrKarty().equals(nrKarty))
//                .findFirst()
//                .orElseThrow(() -> {
//                    throw new BusinessException("Wprowadzono błędne dane karty");
//                });
//

        do {

            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Sprawdź stan konta karty");
            System.out.println("0. Przerwij Operację");

            Integer userInfo = 0;

            try {
                userInfo = scanUser.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby z menu.");
            }

            czyKontynuowac = menu2(userInfo, karta);

        } while (czyKontynuowac);
    }

        private boolean menu2(final Integer pozycja, Karta karta) {

            Integer kwota = 0;

            try {
                switch (pozycja) {
                    case 1:
                        System.out.println("Wpłacam gotówkę");

                        System.out.print("Proszę podać kwotę wpłaty: ");
                        kwota = scanUser.nextInt();
                        sprawdzWprowadzaneKwoty(kwota);

                        bankomat.wplacGotowke(kwota);
                        karta.wplacGotowke(kwota);
                        break;

                    case 2:
                        System.out.println("Wypłacam gotówkę");
                        System.out.print("Proszę podać kwotę wypłaty: ");
                        kwota = scanUser.nextInt();
                        sprawdzWprowadzaneKwoty(kwota);

                        bankomat.sprawdzWyplate(kwota);
                        karta.sprawdzWyplate(kwota);
                        bankomat.wyplacGotowke(kwota);
                        karta.wyplacGotowke(kwota);

                        break;

                    case 3:
                        System.out.println("Stan konta");
                        System.out.println("Bankomant posiada: " + bankomat.stanKonta());
                        break;

                    case 4:
                        System.out.println("Saldo karty");
                        System.out.println("Na karcie posiadasz: " + karta.stanKonta());
                        break;

                }
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłaty/wypłaty.");
            }
            return pozycja != 0;
    }
}
