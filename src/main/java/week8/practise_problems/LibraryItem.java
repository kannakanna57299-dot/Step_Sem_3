package week8.practise_problems;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public interface LibraryItem {
    int getBorrowingDays();
    String getType();
}

class Book implements LibraryItem {
    public int getBorrowingDays() {
        return 14;
    }

    public String getType() {
        return "BOOK";
    }
}

class DVD implements LibraryItem {
    public int getBorrowingDays() {
        return 7;
    }

    public String getType() {
        return "DVD";
    }
}

class Magazine implements LibraryItem {
    public int getBorrowingDays() {
        return 3;
    }

    public String getType() {
        return "MAGAZINE";
    }
}

class BorrowedItem {
    LibraryItem item;
    String title;

    BorrowedItem(LibraryItem item, String title) {
        this.item = item;
        this.title = title;
    }

    LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(item.getBorrowingDays());
    }
}

class Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        LocalDate currentDate = LocalDate.of(2023, 10, 26);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            // Remove the item type
            String[] parts = line.split(" ", 2);

            String type = parts[0];

            // Remove quotes around title
            String title = parts[1];

            if (title.startsWith("\"") && title.endsWith("\"")) {
                title = title.substring(1, title.length() - 1);
            }

            LibraryItem item;

            if (type.equals("BOOK")) {
                item = new Book();
            }
            else if (type.equals("DVD")) {
                item = new DVD();
            }
            else {
                item = new Magazine();
            }

            BorrowedItem borrowedItem =
                    new BorrowedItem(item, title);

            LocalDate dueDate =
                    borrowedItem.getDueDate(currentDate);

            System.out.println(
                    title + ": " + dueDate.format(formatter)
            );
        }
    }
}