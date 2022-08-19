package pl.cyber.trainees.wyjasnienia.bankomat;

public class Karta {
    private final Integer nrKarty;
    private final Integer pinKarty;
    private Integer saldo;


    public Karta(final Integer nrKarty, final Integer pinKarty, final Integer saldo) {
        this.nrKarty = nrKarty;
        this.pinKarty = pinKarty;
        this.saldo = saldo;


    }

    public Integer getNrKarty() {
        return nrKarty;
    }

    public Karta(final Integer nrKarty) {
        this.nrKarty = nrKarty;
    }

    public void sprawzPin(final Integer nrKarty) {
        if (!this.pinKarty.equals(pinKarty)) {
            throw new KartaException("Niepoprawny pin dla karty.");
        }
    }
}
