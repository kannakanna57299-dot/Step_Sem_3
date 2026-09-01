package week3.assignment_probels;
import java.util.Scanner;
public class multiples {
    static void printSkippingMultiplesOfThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printSkippingMultiplesOfThree();
    }
}
