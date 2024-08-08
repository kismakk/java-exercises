package test.java.bufferedreader;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.bufferedreader.solution.FileManager;

public class FileManagerTest {
    private final String file = "javaio_bufferedreader/src/test/resources/employees.txt";

    @Test
    public void testReadFile() {
        List<String> employees = FileManager.readFile(file);
        System.out.println("Employees: " + employees);
        assertEquals(4, employees.size());
        assertEquals("John Doe", employees.get(0));
        assertEquals("Jane Doe", employees.get(1));
        assertEquals("Mary Jane", employees.get(2));
        assertEquals("Michael Smith", employees.get(3));
    }
}
