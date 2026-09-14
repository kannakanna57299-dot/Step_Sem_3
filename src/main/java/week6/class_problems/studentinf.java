package week6.class_problems;
class Student {

    // Instance fields
    String name;
    int attendance;

    // Static fields - shared by all objects
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    // Constructor
    Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;

        // Increase count whenever an object is created
        studentCount++;
    }

    // Static method
    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class studentinf {
    public static void main(String[] args) {

        // Create two Student objects
        Student s1 = new Student("Ravi", 90);
        Student s2 = new Student("Anitha", 95);

        System.out.println("2 Student objects created");
        System.out.println();

        // Call static method using class name
        Student.printCollegeInfo();
    }
}
