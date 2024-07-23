package OOP_chapter5_combined.src.main.java.combined.solution;

public class Member extends Person {

    public Member(String name, String id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Member name: " + getName() + ", ID: " + getId());
    }

    public void borrowItem(Borrowable item) {
        item.borrow();
    }

    public void returnItem(Borrowable item) {
        item.returnItem();
    }
}
