package OOP_chapter2_polymorphism.src.main.java.polymorphism.solutions;

public class Shapes {
    public static void main(String args[]) {
        Shape triangle = new Triangle(10, 5);
        Shape trapezoid = new Trapezoid(5, 3, 10);

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Trapezoid area: " + trapezoid.calculateArea());
    }
}
