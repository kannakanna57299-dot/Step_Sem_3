import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class BookCopyFinder {

    static Node build(String[] books) {
        Node head = null;
        Node tail = null;

        for (String book : books) {
            Node newNode = new Node(book);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    static String find(Node head, String id) {
        Node temp = head;

        int position = 1;
        int firstPosition = -1;
        int copies = 0;

        while (temp != null) {
            if (temp.data.equals(id)) {
                if (firstPosition == -1) {
                    firstPosition = position;
                }

                copies++;
            }

            position++;
            temp = temp.next;
        }

        if (copies == 0) {
            return id + " not found";
        }

        return id + " first at position " +
                firstPosition + ", copies: " + copies;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] books = new String[n];

        for (int i = 0; i < n; i++) {
            books[i] = sc.next();
        }

        String id = sc.next();

        Node head = build(books);

        System.out.println(find(head, id));

        sc.close();
    }
}