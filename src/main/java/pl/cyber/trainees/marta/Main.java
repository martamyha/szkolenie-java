package pl.cyber.trainees.marta;

import static pl.cyber.trainees.marta.Person.ileRazy;

public class Main {
    public static void main(String[] args) {

        Person pawel = new Person() ;
        pawel.name = "Paweł";
        pawel.age = 18;
        pawel.isAlive = true;
        pawel.isWorking = true;

        Person mikolaj = new Person() ;
        mikolaj.name = "Mikołaj";
        mikolaj.age = 100;
        mikolaj.isAlive = false;

        boolean formal = false;
        pawel.przedstawSie (false);
        mikolaj.przedstawSie(false);
        pawel.przedstawSie (true);

        int ileRazy = Person.ileRazyPrzedstawili();
        System.out.println("Osoby przedstawiły się " + ileRazy + " razy ");
    }
}
