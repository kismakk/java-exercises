package chapter1.src.test.java.inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import chapter1.src.main.java.inheritance.exercise1.Person;
import chapter1.src.main.java.inheritance.exercise1.Student;
import chapter1.src.main.java.inheritance.exercise2.GraduateStudent;

public class CombinedTest {
    
    @Test
    void testCombined() {
        Person person = new Person("John", 35);
        Student student = new Student("Jane", 20, 12345);
        GraduateStudent gradStudent = new GraduateStudent("Mary", 25, 67890, "The Art of Testing", 2022);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        person.displayInfo();
        assertEquals("Name: John, Age: 35\n", outContent.toString());
        outContent.reset();

        student.displayStudentInfo();
        assertEquals("Name: Jane, Age: 20\nStudent ID: 12345\n", outContent.toString());
        outContent.reset();

        gradStudent.displayGraduateStudentInfo();
        assertEquals("Name: Mary, Age: 25\nStudent ID: 67890\nThesis Title: The Art of Testing\nGraduation Year: 2022\n", outContent.toString());
    }
}
