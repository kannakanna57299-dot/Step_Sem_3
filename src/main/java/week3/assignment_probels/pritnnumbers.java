package week3.assignment_probels;
import java.util.Scanner;
public class pritnnumbers {
    static void printnumbersupton(int n) {
        if(n<0) {
            System.out.println("Invalid input");
        }
        for(int i=0;i<=n;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        printnumbersupton(n);
    }
}
