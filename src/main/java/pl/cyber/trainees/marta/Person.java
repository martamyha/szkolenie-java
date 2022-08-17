package pl.cyber.trainees.marta;

public class Person {
    static  int ileRazy;
    String name;
    int age;
    boolean isAlive;
    boolean isWorking;

    void przedstawSie (boolean formal) {
        ileRazy++;
        if (formal) {
            System.out.println("Witam serdecznie." + "Mam na imię " + name + "." + " Mam " + age + " lat");
        } else {
            System.out.println("Cześć jestem " + name + " mam " + age + " lat ");
        }
    }
    static int ileRazyPrzedstawili() {
        return ileRazy;
    }
}
