package zadanie1;

public class Main {
    public static void main(String[] args) {


        Shape[] tablica1 = {new Square(4.6), new Circle(3.3)};
        Circle[] tablica2 = {new Circle(4.6), new Circle(5.5), new Circle(6.6)};
        Square[] tablica3 = {new Square(4.1), new Square(4.5), new Square(4.9)};

        BoxForShapes<Shape> boxForShapes = new BoxForShapes<>(tablica1);
        BoxForShapes<Circle> boxForCircle = new BoxForShapes<>(tablica2);
        BoxForShapes<Square> boxForSquare = new BoxForShapes<>(tablica3);

        System.out.println(boxForShapes.sumaObwodow());
        System.out.println(boxForCircle.sumaObwodow());
        System.out.println(boxForSquare.sumaObwodow());
    }
}

