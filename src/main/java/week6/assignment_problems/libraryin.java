package week6.assignment_problems;
class BookInventory {

    String title;
    String author;
    int copiesAvailable;

    // Constructor
    BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    // Instance method
    void printEntry() {
        System.out.println(title + " by " + author + " - "
                + copiesAvailable + " copies available");
    }
}

public class libraryin {
    public static void main(String[] args) {

        // Create four BookInventory objects
        BookInventory b1 = new BookInventory(
                "Clean Code", "Robert C. Martin", 3);

        BookInventory b2 = new BookInventory(
                "Effective Java", "Joshua Bloch", 5);

        BookInventory b3 = new BookInventory(
                "Refactoring", "Martin Fowler", 0);

        BookInventory b4 = new BookInventory(
                "Design Patterns", "GoF", 2);

        // Array of objects
        BookInventory[] books = {b1, b2, b3, b4};

        // Print each book
        for (int i = 0; i < books.length; i++) {
            books[i].printEntry();
        }
    }
}
