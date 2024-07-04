package chapter2.src.main.java.polymorphism.solutions;

public class Trapezoid extends Shape {
    public double topBase;

    public Trapezoid(double base, double topBase, double height) {
        super(base, height);
        this.topBase = topBase;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base + topBase) * height;
    }
}