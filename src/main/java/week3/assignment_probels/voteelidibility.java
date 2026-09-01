package week3.assignment_probels;
import  java.util.Scanner;
public class voteelidibility {
     static void checkvotingeligibility(int age) {
        boolean eligible=age>=18;
        if(eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age of the person:");
    int age=sc.nextInt();
    checkvotingeligibility(age);
    }
}
