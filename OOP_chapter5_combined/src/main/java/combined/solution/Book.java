package OOP_chapter5_combined.src.main.java.combined.solution;

public class Book extends Item implements Borrowable {
    private String author;
    private boolean borrowed;

    public Book(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
        this.borrowed = false;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle()
                + ", Author: " + author
                + ", ID: " + getItemId()
                + ", Borrowed: " + isBorrowed());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println(getTitle() + " has been borrowed.");
        } else {
            System.out.println(getTitle() + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println(getTitle() + " has been returned.");
        } else {
            System.out.println(getTitle() + " was not borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

}
