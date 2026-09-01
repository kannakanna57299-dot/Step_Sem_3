package week4.class_problems;

public class rotatingarray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;

        for (int r = 1; r <= k; r++) {

            int last = arr[n - 1];

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}