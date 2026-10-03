package week9.practise_problems;
import java.util.*;

abstract class Travel {
    int distance;

    Travel(int distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    double bookingFee() {
        return 50;
    }

    double totalFare() {
        return calculateFare() + bookingFee();
    }
}

class Bus extends Travel {
    Bus(int distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 2;
    }
}

class Train extends Travel {
    Train(int distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 1.5;
    }
}

class Flight extends Travel {
    Flight(int distance) {
        super(distance);
    }

    double calculateFare() {
        return 2500 + distance * 4;
    }
}

public class travel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            int distance = sc.nextInt();

            Travel t;

            if (mode.equals("BUS"))
                t = new Bus(distance);
            else if (mode.equals("TRAIN"))
                t = new Train(distance);
            else
                t = new Flight(distance);

            System.out.printf("%s: %.2f%n", mode, t.totalFare());
        }
    }
}