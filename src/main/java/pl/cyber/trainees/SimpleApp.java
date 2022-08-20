package pl.cyber.trainees;
import pl.cyber.trainees.wyjasnienia.Wyjatki;
import pl.cyber.trainees.wyjasnienia.bankomat.BankomatService;

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
        service.uruchomRozwiazanie2();
    }
}


