package OOP_chapter4_abstraction.src.test.java.abstraction.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Modifier;

import org.junit.Test;

import OOP_chapter4_abstraction.src.main.java.abstraction.solutions.exercise1.*;

public class ShapesExerciseTest {

    @Test
    public void testClassesExist() {
        assertNotNull(Shape.class, "Shape class should exist.");
        assertNotNull(Circle.class, "Circle class should exist.");
        assertNotNull(Rectangle.class, "Rectangle class should exist.");
    }

    @Test
    public void testShapeIsAbstract() {
        int modifiers = Shape.class.getModifiers();
        assertTrue(Modifier.isAbstract(modifiers), "Shape class should be abstract.");
    }

    @Test
    public void testSubclassesExtendsShape() {
        assertTrue(Shape.class.isAssignableFrom(Circle.class), "Circle should extend Shape.");
        assertTrue(Shape.class.isAssignableFrom(Rectangle.class), "Rectangle should extend Shape.");
    }

    @Test
    public void testCalculateArea() {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);

        assertEquals(78.54, circle.calculateArea(), 0.01);
        assertEquals(50, rectangle.calculateArea(), 0.01);
    }
}
