package Zad5Pracownik;

public class Pracownik {
    //Utwórz klasę Pracownik (imie, nazwisko, stanowisko).
    // Dodaj 5 pracowników do zbioru. Usuń z niego dwóch pierwszych dodanych pracowników.
    // Wyświetl zawartość zbioru.
    private String imie, nazwisko, stanowisko;

    public Pracownik(String imie, String nazwisko, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
}
