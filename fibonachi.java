import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to print the first n Fibonacci numbers: ");
        int n = sc.nextInt();
       

        long a = 0;
        long b = 1;

        System.out.print("Fibonacci series: ");

        if (n >= 1) {
            System.out.print(a);
        }
        if (n >= 2) {
            System.out.print(" " + b);
        }

        for (int i = 3; i <= n; i++) {
            long next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }

        System.out.println();
         sc.close();
    }
}
