package chapter1.src.test.java.inheritance.exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import chapter1.src.main.java.inheritance.exercise2.GraduateStudent;

public class MultilevelInheritanceTest {
    
    @Test
    void testGraduateStudentAttributesAndMethods() {
        GraduateStudent gradStudent = new GraduateStudent("Mary", 25, 67890, "The Art of Testing", 2022);

        assertEquals("Mary", gradStudent.name);
        assertEquals(25, gradStudent.age);
        assertEquals(67890, gradStudent.studentID);
        assertEquals("The Art of Testing", gradStudent.thesisTitle);
        assertEquals(2022, gradStudent.graduationYear);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        gradStudent.displayGraduateStudentInfo();

        assertEquals("Name: Mary, Age: 25\nStudent ID: 67890\nThesis Title: The Art of Testing\nGraduation Year: 2022\n", outContent.toString());
    }
}
