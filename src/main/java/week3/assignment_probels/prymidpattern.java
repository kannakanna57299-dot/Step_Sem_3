package week3.assignment_probels;
import java.util.Scanner;
public class prymidpattern {
    void printNumberPyramid(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        printNumberPyramid(n);
    }
}
