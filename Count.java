
import java.util.Scanner;
public class Count{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
       int a = sc.nextInt(),c=0;
       while(a!=0){
           c++;
           a/=10;
       }
       System.out.println(c);
        sc.close();
    }
}