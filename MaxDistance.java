import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxDistance = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[i] == arr[j]) {
                    if (j - i > maxDistance) {
                        maxDistance = j - i;
                    }
                    break;
                }
            }
        }

        System.out.println(maxDistance);

        sc.close();
    }
}