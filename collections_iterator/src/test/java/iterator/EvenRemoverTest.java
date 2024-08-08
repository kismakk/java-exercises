package collections_iterator.src.test.java.iterator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import collections_iterator.src.main.java.iterator.solution.EvenRemover;

public class EvenRemoverTest {
    private EvenRemover evenRemover;
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    public void setUp() {
        evenRemover = new EvenRemover();
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.out.flush();
        System.setOut(originalOut);
        outputStream.reset();
    }

    @Test
    public void testRemoveEvenNumbers() {
        for (int i = 0; i <= 10; i++) {
            evenRemover.add(i);
        }

        evenRemover.removeEvenNumbers();

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Before: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]"));
        assertTrue(output.contains("After: [1, 3, 5, 7, 9]"));
    }
}
