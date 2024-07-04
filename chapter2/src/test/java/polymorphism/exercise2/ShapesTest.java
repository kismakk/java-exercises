package chapter2.src.test.java.polymorphism.exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import chapter2.src.main.java.polymorphism.solutions.Shape;
import chapter2.src.main.java.polymorphism.solutions.Trapezoid;
import chapter2.src.main.java.polymorphism.solutions.Triangle;

public class ShapesTest {
    
    @Test
    void testShapeClassExists() {
        Shape shape = new Shape(5, 10);
        assertEquals(Shape.class, shape.getClass());
    }

    @Test
    void testShapeMethodExists() throws NoSuchMethodException {
        Method calculateAreaMethod = Shape.class.getDeclaredMethod("calculateArea");
        assertEquals("calculateArea", calculateAreaMethod.getName());
    }

    @Test
    void testTriangleOverridesCalculateArea() {
        Triangle triangle = new Triangle(5, 10);
        assertEquals(Triangle.class, triangle.getClass());
    }

    @Test
    void testTriangleArea() {
        Triangle triangle = new Triangle(5, 10);
        assertEquals(25, triangle.calculateArea());
    }

    @Test
    void testTrapezoidOverridesCalculateArea() {
        Trapezoid trapezoid = new Trapezoid(5, 3, 10);
        assertEquals(Trapezoid.class, trapezoid.getClass());
    }

    @Test
    void testTrapezoidArea() {
        Trapezoid trapezoid = new Trapezoid(5, 3, 10);
        assertEquals(40.0, trapezoid.calculateArea());
    }
}
