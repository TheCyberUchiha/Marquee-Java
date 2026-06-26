// You are using Java
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),s=0;
        while(a!=0){
            int r = a%10;
            s = s + r;
            a/=10;
        }      
        System.out.println(s);
       
        sc.close();
    }
}