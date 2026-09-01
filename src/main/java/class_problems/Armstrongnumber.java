package class_problems;
import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int originalnumber=num;
        int sum=0;
        while(num>0) {
            int lastdigit=num%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            num=num/10;
        }
        if(originalnumber==sum) {
            System.out.println("Given number is a armstrong number");
        } else {
            System.out.println("Given number is a not a armstrong number");
        }
    }
}
