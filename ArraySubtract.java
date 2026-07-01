import java.util.Scanner;

public class ArraySubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] ans = new int[n1];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = n1 - 1;
        int borrow = 0;

        while (k >= 0) {
            int d1 = arr1[i] - borrow;
            int d2 = (j >= 0) ? arr2[j] : 0;

            if (d1 < d2) {
                d1 += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            ans[k] = d1 - d2;

            i--;
            j--;
            k--;
        }

        System.out.print("Result: ");
        boolean leadingZero = true;

        for (int x : ans) {
            if (x != 0) {
                leadingZero = false;
            }
            if (!leadingZero) {
                System.out.print(x + " ");
            }
        }

        if (leadingZero) {
            System.out.print(0);
        }

        sc.close();
    }
}