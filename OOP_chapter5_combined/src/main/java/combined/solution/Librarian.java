package OOP_chapter5_combined.src.main.java.combined.solution;

public class Librarian extends Person {

    public Librarian(String name, String id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Librarian name: " + getName() + ", ID: " + getId());
    }

    public void addBook() {
        System.out.println("Librarian " + getName() + " added a book.");
    }
}
