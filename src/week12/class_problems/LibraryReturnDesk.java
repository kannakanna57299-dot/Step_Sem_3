import java.util.Scanner;

public class LibraryReturnDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pile = new String[3];
        int top = -1;

        String[] queue = new String[3];
        int front = 0;
        int rear = -1;
        int size = 0;

        String input = sc.useDelimiter("\\A").next();
        String[] commands = input.split("[,\\n]+");

        for (String cmd : commands) {
            cmd = cmd.trim();

            if (cmd.isEmpty())
                continue;

            String[] p = cmd.split("\\s+");
            String op = p[0].toUpperCase();

            if (op.equals("RETURN")) {
                String book = p[1];

                if (top == 2) {
                    System.out.println(book + " rejected: pile is full");
                } else {
                    pile[++top] = book;
                    System.out.println(book + " placed on pile");
                }
            }

            else if (op.equals("SHELVE")) {
                if (top == -1) {
                    System.out.println("pile is empty");
                } else {
                    System.out.println("shelved " + pile[top]);
                    top--;
                }
            }

            else if (op.equals("WAIT")) {
                String student = p[1];

                if (size == 3) {
                    System.out.println(student + " rejected: line is full");
                } else {
                    rear = (rear + 1) % 3;
                    queue[rear] = student;
                    size++;

                    System.out.println(student + " joined the line");
                }
            }

            else if (op.equals("SERVE")) {
                if (size == 0) {
                    System.out.println("no one waiting");
                } else {
                    System.out.println("served " + queue[front]);

                    front = (front + 1) % 3;
                    size--;
                }
            }
        }

        sc.close();
    }
}