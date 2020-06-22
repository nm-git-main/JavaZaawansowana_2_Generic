package zad2ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Jan");
        list.add("Stefan");
        list.add("Bozena");
        list.add("Eugeniusz");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("\n Przed usunieciem ");
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println("\n Po usunieciu ");
        System.out.println(list.get(1));


        System.out.println("-------------------");
        System.out.println("Usuwam Jana");

        boolean remove = true;
        while (remove) {
            remove = list.remove("Jan");
        }

// wyprint tego co zostało
        for (String s : list) {
            System.out.println(s);
        }
        String[] imiona = {"Elżbieta", "Anna", "Robert"};
        list.addAll(0, Arrays.asList(imiona));
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(" ----------------------- lambda");
        list.forEach(s -> System.out.println(s));

    }

}



