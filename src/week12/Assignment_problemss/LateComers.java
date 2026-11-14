import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class LateComers {

    static Node addFirst(Node head, String name) {
        Node newNode = new Node(name);

        newNode.next = head;
        head = newNode;

        return head;
    }

    static Node addLast(Node head, String name) {
        Node newNode = new Node(name);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

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

        for (int i = 0; i < n; i++) {
            head = addLast(head, sc.next());
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String operation = sc.next();
            String name = sc.next();

            if (operation.equalsIgnoreCase("addFirst")) {
                head = addFirst(head, name);
            } else if (operation.equalsIgnoreCase("addLast")) {
                head = addLast(head, name);
            }
        }

        display(head);

        sc.close();
    }
}