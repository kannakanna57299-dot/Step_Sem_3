package week3.assignment_probels;
import java.util.Scanner;
public class gradeclassify {
    static void classifyWithAttendance(int marks, int attendance) {
        if (marks < 40 && attendance < 75) {
            System.out.println("Detained");
            return;
        }
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("Grade: C");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("Grade: D");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks and attendance");
        int marks=sc.nextInt();
        int attendance=sc.nextInt();
        classifyWithAttendance(marks,attendance);
    }
}
