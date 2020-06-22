package Zad4ListSortowanie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> listaFilmow = new ArrayList<>();

        listaFilmow.add(new Film("Harry Potter", 2002));
        listaFilmow.add(new Film("Sharkado", 2010));
        listaFilmow.add(new Film("Brudny Harry", 1998));
        listaFilmow.add(new Film("Harry Potter", 1990));

        Collections.sort(listaFilmow);

        //listaFilmow.forEach(film -> System.out.println(film.getTytul()));
        listaFilmow.forEach(film -> System.out.println("Film"+ film.getTytul()+" "+film.getRokProdukcji()));

    }
}
