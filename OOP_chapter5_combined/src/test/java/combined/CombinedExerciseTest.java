package OOP_chapter5_combined.src.test.java.combined;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import OOP_chapter5_combined.src.main.java.combined.solution.*;

public class CombinedExerciseTest {
    private Member member;
    private Librarian librarian;
    private Book javaBook;

    @BeforeEach
    public void setUp() {
        member = new Member("John Doe", "M1234");
        librarian = new Librarian("Jane Doe", "L0202");
        javaBook = new Book("Java Programming", "JAVA01", "John Q. Public");
    }

    @Test
    void testInheritance() {
        assertTrue(member instanceof Person);
        assertTrue(librarian instanceof Person);
        assertTrue(javaBook instanceof Item);
    }

    @Test
    void testMemberInfo() {
        String expectedOutput = "Member name: John Doe, ID: M1234";
        assertEquals("John Doe", member.getName());
        assertEquals("M1234", member.getId());

        // Test the output of the displayInfo method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        member.displayInfo();

        System.setOut(originalOut);

        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testLibrarianInfo() {
        String expectedOutput = "Librarian name: Jane Doe, ID: L0202";
        assertEquals("Jane Doe", librarian.getName());
        assertEquals("L0202", librarian.getId());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        librarian.displayInfo();

        System.setOut(originalOut);

        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testBorrowingBook() {
        member.borrowItem(javaBook);
        assertTrue(javaBook.isBorrowed());
    }

    @Test
    void testReturningBook() {
        member.borrowItem(javaBook);
        assertTrue(javaBook.isBorrowed());
        member.returnItem(javaBook);
        assertFalse(javaBook.isBorrowed());
    }

    @Test
    void testBorrowingAlreadyBorrowedBook() {
        member.borrowItem(javaBook);
        assertTrue(javaBook.isBorrowed());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        member.borrowItem(javaBook);

        System.setOut(originalOut);

        assertEquals("Java Programming is already borrowed.", outContent.toString().trim());
    }

    @Test
    void testAddingBook() {
        String expectedOutput = "Librarian Jane Doe added a book.";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        librarian.addBook();

        System.setOut(originalOut);

        assertEquals(expectedOutput, outContent.toString().trim());
    }

}
