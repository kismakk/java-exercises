package chapter1.src.test.java.inheritance.exercise1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import chapter1.src.main.java.inheritance.exercise1.Person;
import chapter1.src.main.java.inheritance.exercise1.Student;

public class InheritanceTest {
    
    @Test
    void testPersonAttributesAndMethods() {
        Person person = new Person("John", 35);

        assertEquals("John", person.name);
        assertEquals(35, person.age);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        person.displayInfo();

        assertEquals("Name: John, Age: 35\n", outContent.toString());
    }

    @Test
    void testStudentAttributesAndMethods() {
        Student student = new Student("Jane", 20, 12345);

        assertEquals("Jane", student.name);
        assertEquals(20, student.age);
        assertEquals(12345, student.studentID);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        student.displayStudentInfo();

        assertEquals("Name: Jane, Age: 20\nStudent ID: 12345\n", outContent.toString());
    }
}
