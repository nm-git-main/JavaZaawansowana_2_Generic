package Zad5Pracownik;

import zad3Sety.Osoba;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Pracownik> listPracownik = new ArrayList<>();

        listPracownik.add(new Pracownik("Zuzia", "Kowal", "KowlLosu"));
        listPracownik.add(new Pracownik("Janina", "Kowalska", "Licealistka"));
        listPracownik.add(new Pracownik("Basia", "Wydra", "Aquanurek"));
        listPracownik.add(new Pracownik("Anna", "Bagietka", "Piekarz"));
        listPracownik.add(new Pracownik("Andrzej", "Wykop", "KopaczRowow"));

        listPracownik.remove(0);
        listPracownik.remove(0);

        for (Pracownik pracownik : listPracownik) {
            System.out.println(pracownik.getImie() + " " + pracownik.getNazwisko() + " " + pracownik.getStanowisko());
        }
        listPracownik.forEach(s -> System.out.println(s.getImie()));

    }
}
