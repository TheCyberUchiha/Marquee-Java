
import java.util.Scanner;


public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Binary to Decimal
        String str= sc.nextLine();
        int sum = 0;
        for(int i=0;i<str.length();i++){
            sum = sum * 2 + (str.charAt(i) - '0');   // if we use sum * 8 , octal to Decimal
        }
        System.out.println(sum);
        sc.close();
    }
}
