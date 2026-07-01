import java.util.Scanner;

public class ShortestDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lastEvenIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                count++;

                if (lastEvenIndex != -1) {
                    int distance = i - lastEvenIndex;

                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }

                lastEvenIndex = i;
            }
        }

        if (count <= 1) {
            System.out.println(-1);
        } else {
            System.out.println(minDistance);
        }

        sc.close();
    }
}