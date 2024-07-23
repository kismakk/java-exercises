package OOP_chapter5_combined.src.main.java.combined.solution;

public abstract class Item {
    private String title;
    private String itemId;

    public Item(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public abstract void displayDetails();
}
