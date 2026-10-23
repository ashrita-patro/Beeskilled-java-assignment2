package LibraryManagementSystem;
public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        User user = new User("Ashrita");

        // Add books
        library.addBook(
            new Book("Clean Code", "Robert C. Martin")
        );

        library.addBook(
            new Book("Effective Java", "Joshua Bloch")
        );

        library.addBook(
            new Book("Java Basics", "Learning Team")
        );

        // Display all books
        library.showBooks();

        // Borrow a book
        library.borrowBook("Effective Java", user);

        library.showBooks();

        // Return a book
        library.returnBook("Effective Java", user);

        library.showBooks();
    }
}

