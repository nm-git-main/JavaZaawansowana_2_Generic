package Zad4ListSortowanie;

public class Film implements Comparable<Film> {
    private String tytul;
    private int rokProdukcji;

    public Film(String tytl, int rokProdukcji) {
        this.tytul = tytl;
        this.rokProdukcji = rokProdukcji;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    /* @Override
     public int compareTo(Film o) {


         System.out.println(o.tytul.compareTo(this.tytul));
         return o.tytul.compareTo(this.tytul);
     }*/
    @Override
    public int compareTo(Film o) {
        System.out.println(this.rokProdukcji);
        System.out.println(o.rokProdukcji);

        System.out.println(this.rokProdukcji-o.rokProdukcji);
        return this.rokProdukcji-o.rokProdukcji;
    }

}
