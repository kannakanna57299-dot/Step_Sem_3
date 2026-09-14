package week6.assignment_problems;
class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    // Constructor for permanent employee
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Constructor for intern
    public Employee(String empId, String empName) {
        // Call the 3-argument constructor
        this(empId, empName, 0);

        // Change intern status
        this.isIntern = true;
    }

    // Print profile
    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs "
                + salary + " | Intern: " + isIntern);
    }
}

public class employrrprofile {
    public static void main(String[] args) {

        // Permanent employee
        Employee e1 = new Employee("E-101", "Divya", 65000);

        // Intern
        Employee e2 = new Employee("E-102", "Arjun");

        // Print profiles
        e1.printProfile();
        e2.printProfile();
    }
}