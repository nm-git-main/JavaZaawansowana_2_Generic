package zadanie1;

public class BoxForShapes<T extends Shape> {
    T[] tablica;

    public BoxForShapes(T[] tablica) {
        this.tablica = tablica;
    }

    public double sumaObwodow (){
        double wynik=0;
        for(T t:tablica){
            wynik+=t.obliczObwod();
       }
        return wynik;


    }
   // <T ...> niech pozwala ona na podanie typu generycznego
    // extends Shape -> rozszerzajacego interfejs Shape niech przechowuje ona tablice typu T z ksztaltami
    // Interfejs Shape niech posiada metode obliczajaca obwod (circuit)-> double obliczObwod();
    // Stworz 2 klasy implementujace interfejs Shape - Square i Circle
    // Niech BoxForShapes posiada metode obliczajaca sume obowodow wszystkich ksztaltow
    // w main stworzcie 3 tablice - jedna typu Shape Jedna typu Square i jedna typu Circle
    // wypelnijcie je 2-3 przykladami

    // stworzcie osobne pudelka na typ Shape, typ Square i typ Circle
    // wyswietlcie sumy obwodow w konsoli


}
