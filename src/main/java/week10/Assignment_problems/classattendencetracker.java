package week10.Assignment_problems;

import java.util.Arrays;

public class classattendencetracker {

    static int[] attendanceSummary(int[] days) {
        int present = 0;
        int streak = 0;
        int longest = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] == 1) {
                present++;
                streak++;

                if (streak > longest) {
                    longest = streak;
                }
            } else {
                streak = 0;
            }
        }

        return new int[]{present, longest};
    }

    public static void main(String[] args) {
        int[] days = {1, 1, 0, 1, 1, 1, 0, 1};

        int[] result = attendanceSummary(days);

        System.out.println("Present: " + result[0]
                + ", Longest streak: " + result[1]);

        int[] days2 = {0, 0, 0};
        int[] result2 = attendanceSummary(days2);

        System.out.println("Present: " + result2[0]
                + ", Longest streak: " + result2[1]);
    }
}
