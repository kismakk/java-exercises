package chapter3.src.test.java.encapsulation.exercise1;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import chapter3.src.main.java.encapsulation.solutions.exercise1.Box;

public class BoxTest {
    
    @Test
    void testAttributesExistence() throws NoSuchFieldException {
        Field length = Box.class.getDeclaredField("length");
        Field width = Box.class.getDeclaredField("width");
        Field height = Box.class.getDeclaredField("height");

        assertEquals("length", length.getName());
        assertEquals("width", width.getName());
        assertEquals("height", height.getName());
    }

    @Test
    void testMethodsExistence() throws NoSuchMethodException {
        Method calculateSurfaceArea = Box.class.getDeclaredMethod("calculateSurfaceArea");
        Method calculateLateralSurfaceArea = Box.class.getDeclaredMethod("calculateLateralSurfaceArea");
        Method calculateVolume = Box.class.getDeclaredMethod("calculateVolume");

        assertEquals("calculateSurfaceArea", calculateSurfaceArea.getName());
        assertEquals("calculateLateralSurfaceArea", calculateLateralSurfaceArea.getName());
        assertEquals("calculateVolume", calculateVolume.getName());
    }

    @Test
    void testAttributesAccessibility() throws NoSuchFieldException {
        Field length = Box.class.getDeclaredField("length");
        Field width = Box.class.getDeclaredField("width");
        Field height = Box.class.getDeclaredField("height");

        assertTrue(Modifier.isPrivate(length.getModifiers()));
        assertTrue(Modifier.isPrivate(width.getModifiers()));
        assertTrue(Modifier.isPrivate(height.getModifiers()));
    }

    @Test
    void testMethodsAccessibility() throws NoSuchMethodException {
        Method setLength = Box.class.getDeclaredMethod("setLength", double.class);
        Method setWidth = Box.class.getDeclaredMethod("setWidth", double.class);
        Method setHeight = Box.class.getDeclaredMethod("setHeight", double.class);

        assertTrue(Modifier.isPrivate(setLength.getModifiers()));
        assertTrue(Modifier.isPrivate(setWidth.getModifiers()));
        assertTrue(Modifier.isPrivate(setHeight.getModifiers()));
    }

    @Test
    void testValidations() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Box(-1, 1, 1);
        });
        assertEquals("Length cannot be zero or negative.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            new Box(1, -1, 1);
        });
        assertEquals("Width cannot be zero or negative.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            new Box(1, 1, -1);
        });
        assertEquals("Height cannot be zero or negative.", exception.getMessage());
    }

    @Test
    void testCalculations() {
        Box box = new Box(2, 4, 6);

        assertEquals(88, box.calculateSurfaceArea(), 0.0001);
        assertEquals(72, box.calculateLateralSurfaceArea(), 0.0001);
        assertEquals(48, box.calculateVolume(), 0.0001);
    }
}
