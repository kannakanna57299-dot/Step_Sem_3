package class_problems;

import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<num;i++) {
            if(num%i==0) {
                isprime=false;
                break;
            }
        }
        if(!isprime) {
            System.out.println("The given number is not a prime number");
        }
        else {
            System.out.println("The given number is a prime number");
        }
    }
}