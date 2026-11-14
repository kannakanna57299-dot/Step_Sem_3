import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class CancelBooking {

    static boolean found = false;

    static Node removeFirst(Node head, String booking) {

        if (head == null) {
            return null;
        }

        if (head.data.equals(booking)) {
            found = true;
            return head.next;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data.equals(booking)) {
                found = true;
                temp.next = temp.next.next;
                return head;
            }

            temp = temp.next;
        }

        return head;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.next());

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        String booking = sc.next();

        head = removeFirst(head, booking);

        if (!found) {
            System.out.println(booking + " not found");
        }

        display(head);

        sc.close();
    }
}