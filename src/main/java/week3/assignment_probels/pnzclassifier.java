package week3.assignment_probels;
import java.util.Scanner;
public class pnzclassifier {
    static void classifynumber(int num) {
        if(num>0) {
            System.out.println("Positive");
        }
        else if(num<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number=");
        int num=sc.nextInt();
        classifynumber(num);
    }
}
