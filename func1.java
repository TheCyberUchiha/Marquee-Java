import java.util.Scanner;

public class func1 {

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isEven(i)) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
        sc.close();
    }
}       