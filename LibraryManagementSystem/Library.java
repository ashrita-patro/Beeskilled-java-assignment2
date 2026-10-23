package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Display all books
    public void showBooks() {

        System.out.println("\n----- Library Books -----");

        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        for (Book book : books) {
            book.displayInfo();
        }
    }

    // Borrow a book
    public void borrowBook(String title, User user) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isBorrowed()) {
                    System.out.println(
                        "Sorry, this book is already borrowed."
                    );
                } else {
                    book.borrow();

                    System.out.println(
                        user.getName() + " borrowed: "
                        + book.getTitle()
                    );
                }

                return;
            }
        }

        System.out.println("Book not found: " + title);
    }

    // Return a book
    public void returnBook(String title, User user) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (!book.isBorrowed()) {
                    System.out.println(
                        "This book was not borrowed."
                    );
                } else {
                    book.giveBack();

                    System.out.println(
                        user.getName() + " returned: "
                        + book.getTitle()
                    );
                }

                return;
            }
        }

        System.out.println("Book not found: " + title);
    }
}