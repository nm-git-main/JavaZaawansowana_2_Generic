package zadanie1;

public class Square implements Shape {
    private double a;
    public Square(double a){
        this.a=a;
    }


    @Override

    public double obliczObwod() {
        return 4 * a;
    }
}
