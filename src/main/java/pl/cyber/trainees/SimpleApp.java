package pl.cyber.trainees;
import pl.cyber.trainees.wyjasnienia.InstrukcjeWarunkowe;
import pl.cyber.trainees.wyjasnienia.Petle;
import pl.cyber.trainees.wyjasnienia.Tablice;
import pl.cyber.trainees.wyjasnienia.Wyjatki;
import pl.cyber.trainees.wyjasnienia.bankomat.BankomatService;

import java.io.IOException;

public class SimpleApp {
    public static void main(String[] args) throws Exception {
//    Petle petle = new Petle();
//    petle.uruchom();

//    InstrukcjeWarunkowe instrukcjeWarunkowe = new InstrukcjeWarunkowe();
//    instrukcjeWarunkowe.uruchom();

//    Tablice tablice = new Tablice();
//    tablice.uruchom();

        Wyjatki wyjatki = new Wyjatki();
        wyjatki.uruchom();

        BankomatService service = new BankomatService();
        service.uruchom();
    }
}


