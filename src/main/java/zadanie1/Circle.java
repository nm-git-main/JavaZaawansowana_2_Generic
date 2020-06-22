package zadanie1;

public class Circle implements Shape {
   private double r;
    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double obliczObwod() {
        return Math.PI*2*r;
    }
}
