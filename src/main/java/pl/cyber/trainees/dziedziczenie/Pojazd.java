package pl.cyber.trainees.dziedziczenie;

public class Pojazd {
    private String marka;
    private String rocznik;
    private String naped;

    public Pojazd() {
        marka = "";
        rocznik = "";
        naped = "";
    }
// Comand + n -> generator konstruktora;
    public Pojazd(final String marka, final String rocznik, final String naped) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }
    public String toString(){
        return "Marka: " + this.marka
        + " rocznik: " + this.rocznik
        + " naped: " +  this.naped;
    }
    public String getMarka() {
        return marka;
    }

    public String getRocznik() {
        return rocznik;
    }

    public String getNapęd() {
        return naped;
    }
}
