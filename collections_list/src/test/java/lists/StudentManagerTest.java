package collections_list.src.test.java.lists;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import collections_list.src.main.java.lists.solution.Student;
import collections_list.src.main.java.lists.solution.StudentManager;

public class StudentManagerTest {
    private StudentManager students;
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    public void setUp() {
        students = new StudentManager();
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
    public void testAddStudent() {
        Student johnDoe = new Student("John Doe", "S1234");
        students.addStudent(johnDoe);

        students.displayStudents();

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Name: John Doe, ID: S1234"));
    }

    @Test
    public void testRemoveStudent() {
        Student johnDoe = new Student("John Doe", "S1234");
        students.addStudent(johnDoe);

        students.removeStudent("S1234");

        students.displayStudents();

        String output = outputStream.toString().trim();
        assertTrue(output.isEmpty());
    }

    @Test
    public void testFindingStudent() {
        Student johnDoe = new Student("John Doe", "S1234");
        students.addStudent(johnDoe);

        students.findStudent("John Doe");

        String output = outputStream.toString().trim();
        System.out.println(output);
        assertTrue(output.contains("Name: John Doe, ID: S1234"));
    }
}
