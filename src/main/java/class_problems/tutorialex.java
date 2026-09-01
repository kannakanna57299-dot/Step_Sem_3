package class_problems;

class Student {
    int rollNo;
    String name;
    int age;
    Student() {
        rollNo = 0;
        name = "Unknown";
        age = 0;
    }
    Student(int r, String n) {
        rollNo = r;
        name = n;
        age = 18;
    }
    Student(int r, String n, int a) {
        rollNo = r;
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Praveen");
        Student s3 = new Student(102, "Rahul", 20);
        s1.display();
        s2.display();
        s3.display();
    }
}
```
