package pl.cyber.trainees.marta;
//class Variables {
   // public static void main(String[] args) {
        //int age = 10;
        //String firstName = "Marta";
        //String secondName = "Myha";
        //double Multiliplier = 2.9;
        //System.out.println( firstName + secondName + " ma " + age +  " lat");
        //System.out.println(age + " to juz po studiach");
        //System.out.println("Za rok " + ( age + 1));
        //System.out.println(Multiliplier + " razy wiek to " + (Multiliplier * age));
    //}
//}
//praca domowa
//        //Utworzenie 2 zmiennych typu String i ich inicjalizacja
//        //Utworzenie 2 zmiennych typu Integer i ich inicjalizacja
//        //Utworzenie 2 zmiennych typu Double i ich inicjalizacja
//
//        //dodawanie , odejmowanie, monożenie i dzielenie.
//        //proszę o wykonanie działania dzielenie przez 0

public class Variables {
    public static void main(String[] args) {
        String HobbyName = "Karate";
        String AnotherHobbyName = "PoleDance";
        Integer Hobby1CostPerGroup = -250;
        Integer Hobby2CostPerGroup = 500;
        Double PeoplePerTrainer1 = 10.0;
        Double PeoplePerTrainer2 = 9.99;
        System.out.println(HobbyName + " costs " + (Hobby1CostPerGroup / PeoplePerTrainer1));
        System.out.println(AnotherHobbyName + " doesn't cost " + ((Hobby2CostPerGroup + PeoplePerTrainer2) / 0));
    }
}


