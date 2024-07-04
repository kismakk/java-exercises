package chapter2.src.main.java.polymorphism.solutions;

public class Shape {
    public double base;
    public double height;

    public Shape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return base * height;
    }
}