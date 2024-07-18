package OOP_chapter2_polymorphism.src.main.java.polymorphism.solutions;

public class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}