import java.util.Scanner;

public class CountLessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of X: ");
        int x = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}