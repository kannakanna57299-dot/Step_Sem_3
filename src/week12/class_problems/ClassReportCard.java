import java.util.*;

class Student {
    private String name;
    private int m1, m2, m3;

    Student(String name) {
        this.name = name;
    }

    boolean setMarks(int a, int b, int c) {
        if (a < 0 || a > 100 ||
                b < 0 || b > 100 ||
                c < 0 || c > 100) {
            return false;
        }

        m1 = a;
        m2 = b;
        m3 = c;

        return true;
    }

    int getTotal() {
        return m1 + m2 + m3;
    }

    double getAverage() {
        return getTotal() / 3.0;
    }

    String getGrade() {
        double avg = getAverage();

        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 40) return "D";

        return "F";
    }

    public String toString() {
        return name + " total=" + getTotal()
                + " avg=" + String.format(Locale.US, "%.2f", getAverage())
                + " grade=" + getGrade();
    }
}

public class ClassReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            Student s = new Student(name);

            if (s.setMarks(a, b, c)) {
                list.add(s);
            } else {
                System.out.println(
                        name + " skipped: marks must be 0 to 100"
                );
            }
        }

        int passes = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            boolean swapped = false;

            for (int j = list.size() - 2; j >= 0; j--) {
                if (list.get(j).getTotal() <
                        list.get(j + 1).getTotal()) {

                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                    swapped = true;
                }
            }

            if (!swapped)
                break;

            passes++;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }

        System.out.println("Sorted in " + passes + " passes");

        sc.close();
    }
}
