package zad3Sety;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("napis1");
        set.add("napis2");
        set.add("napis1");

        System.out.println(set.size());
        set.forEach(s -> System.out.println(s));

        String zdanie = "Jestem programista Java";
        Set<Character> literkiUzyteWZdaniu = new HashSet<>();
        for (int i = 0; i < zdanie.length(); i++) {
            // dodajemy do setu wszystkie znaki jedne po drugim ze stringa
            literkiUzyteWZdaniu.add(zdanie.charAt(i));
        }
        literkiUzyteWZdaniu.forEach(s-> System.out.println(s));

        Set<Osoba> osoby = new HashSet<>();
        osoby.add(new Osoba("Zuzia" ,"Kowal"));
        osoby.add(new Osoba("Janina" ,"Kowalska"));
        osoby.add(new Osoba("Basia" ,"Wydra"));
        osoby.add(new Osoba("Anna" ,"Bagik"));
        osoby.add(new Osoba("Anna" ,"Bagik"));
        osoby.forEach(osoba -> System.out.println(osoba.getImie()));



    }

}


