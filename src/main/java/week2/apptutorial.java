import java.util.Scanner;

class Student {

    String name;
    int age;
    String course;

    // 1. Default / No-argument constructor
    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    // 2. Parameterized constructor
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to get student details
    void getDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        course = sc.nextLine();
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class apptutorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Demonstrating no-argument constructor
        Student s1 = new Student();
        System.out.println("Student 1:");
        s1.displayDetails();

        // Demonstrating parameterized constructor
        Student s2 = new Student("Ravi", 20, "CSE");
        System.out.println("\nStudent 2:");
        s2.displayDetails();

        // Taking input using method
        Student s3 = new Student();
        System.out.println("\nEnter Student 3 Details:");
        s3.getDetails(sc);

        System.out.println("\nStudent 3:");
        s3.displayDetails();
    }
}