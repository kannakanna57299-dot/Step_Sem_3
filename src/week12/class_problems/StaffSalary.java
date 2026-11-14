import java.util.Scanner;

class Staff {
    String name;
    double baseSalary;

    Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getBonus() {
        return 0.0;
    }

    String getType() {
        return "Staff";
    }

    double getTotalSalary() {
        return baseSalary + getBonus();
    }
}

class Teacher extends Staff {
    Teacher(String name, double salary) {
        super(name, salary);
    }

    @Override
    double getBonus() {
        return 5000.0;
    }

    @Override
    String getType() {
        return "Teacher";
    }
}

class LabAssistant extends Staff {
    LabAssistant(String name, double salary) {
        super(name, salary);
    }

    @Override
    double getBonus() {
        return 2000.0;
    }

    @Override
    String getType() {
        return "LabAssistant";
    }
}

public class StaffSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Staff[] staff = new Staff[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if (type.equalsIgnoreCase("Teacher")) {
                staff[i] = new Teacher(name, salary);
            } else if (type.equalsIgnoreCase("LabAssistant")) {
                staff[i] = new LabAssistant(name, salary);
            } else {
                staff[i] = new Staff(name, salary);
            }
        }

        double grandTotal = 0;

        for (Staff s : staff) {
            double bonus = s.getBonus();
            double total = s.getTotalSalary();

            System.out.printf(
                    "%s (%s): base %.1f, bonus %.1f, total %.1f%n",
                    s.name, s.getType(), s.baseSalary, bonus, total
            );

            grandTotal += total;
        }

        System.out.printf("Grand Total Salary: %.1f%n", grandTotal);

        sc.close();
    }
}