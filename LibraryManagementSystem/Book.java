package LibraryManagementSystem;
public class Book {

    private String title;
    private String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        borrowed = true;
    }

    public void giveBack() {
        borrowed = false;
    }

    public void displayInfo() {

        String status = borrowed ? "Borrowed" : "Available";

        System.out.println(
            title + " by " + author + " [" + status + "]"
        );
    }
}