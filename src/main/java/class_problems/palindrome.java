package class_problems;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int originalnumber=num;
        int reversednumber=0;
        while(num>0) {
            int lastdigit=num%10;
            reversednumber=reversednumber*10+lastdigit;
            num=num/10;
        }
        if(originalnumber==reversednumber) {
            System.out.println("It is palindrome");
        }
        else System.out.println("It is not a palindrome");
    }
}
