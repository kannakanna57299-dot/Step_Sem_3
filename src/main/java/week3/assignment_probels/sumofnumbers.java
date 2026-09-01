package week3.assignment_probels;
import java.util.Scanner;
public class sumofnumbers {
    int sum = 0;
    int counter = 1;
    void printsumofnumbers(int n) {
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        printsumofnumbers(n);
    }
}
