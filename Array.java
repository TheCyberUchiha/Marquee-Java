import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] array = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Print array
        System.out.println("Array is " + Arrays.toString(array));

        // Sum of elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("Sum of the elements in array is " + sum);

        // Even & Odd sum
        int even_sum = 0, odd_sum = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                even_sum += array[i];
                System.out.println(array[i] + " is even");
            } else {
                odd_sum += array[i];
                System.out.println(array[i] + " is odd");
            }
        }

        System.out.println("Even elements sum: " + even_sum);
        System.out.println("Odd elements sum: " + odd_sum);

        // Average (safe + accurate)
        if (n > 0) {
            double avg = (double) sum / n;
            System.out.println("Average of array is: " + avg);
        }

        // Max & Min (correct logic)
        if (n > 0) {
            int max = array[0];
            int min = array[0];

            for (int i = 1; i < n; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
        }

        sc.close();
    }
}