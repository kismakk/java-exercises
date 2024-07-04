package chapter2.src.test.java.polymorphism.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import chapter2.src.main.java.polymorphism.solutions.MathOperations;

public class MathOperationsTest {
    
    @Test
    public void testMethodsExist() throws NoSuchMethodException {
        Method addIntMethod = MathOperations.class.getMethod("add", int.class, int.class);
        Method addDoubleMethod = MathOperations.class.getMethod("add", double.class, double.class);
        Method addThreeIntMethod = MathOperations.class.getMethod("add", int.class, int.class, int.class);

        assertEquals("add", addIntMethod.getName());
        assertEquals("add", addDoubleMethod.getName());
        assertEquals("add", addThreeIntMethod.getName());
    }

    @Test
    public void testAddTwoIntegers() {
        MathOperations mathOperations = new MathOperations();
        assertEquals(3, mathOperations.add(1, 2));
        assertEquals(-5, mathOperations.add(1, -6));
        assertEquals(0, mathOperations.add(0, 0));
        assertEquals(10000, mathOperations.add(5000, 5000));
    }

    @Test
    public void testAddTwoDoubles() {
        MathOperations mathOperations = new MathOperations();
        assertEquals(3.5, mathOperations.add(1.2, 2.3), 0.0001);
        assertEquals(-0.8, mathOperations.add(1.5, -2.3), 0.0001);
        assertEquals(0.0, mathOperations.add(0.0, 0.0), 0.0001);
        assertEquals(100000.0, mathOperations.add(50000.0, 50000.0), 0.0001);
    }

    @Test
    public void testAddThreeIntegers() {
        MathOperations mathOperations = new MathOperations();
        assertEquals(6, mathOperations.add(1, 2, 3));
        assertEquals(-2, mathOperations.add(1, -6, 3));
        assertEquals(0, mathOperations.add(0, 0, 0));
        assertEquals(123456, mathOperations.add(120000, 3400, 56));
    }

    @Test
    public void testEdgeCases() {
        MathOperations mathOperations = new MathOperations();
        assertEquals(-1, mathOperations.add(Integer.MAX_VALUE, Integer.MIN_VALUE));
        assertEquals(Double.POSITIVE_INFINITY, mathOperations.add(Double.MAX_VALUE, Double.MAX_VALUE));
        assertEquals(Double.NaN, mathOperations.add(Double.NaN, 1.0), 0.0001);
    }
}
