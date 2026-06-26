// You are using Java
import java.util.Scanner;
public class PALINDROME {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        a = a.toLowerCase();
        int i = 0, j =a.length() - 1,s =  0;
        while(i < j){
            if(a.charAt(i)==a.charAt(j)){
                i++;
                j--;
            }else{
                s = 1;
                break;
            }
        }
        if(s == 0){
            System.out.println("Palindrome hai bhai ");
        }else{
            System.out.println("Nahi he bhai Palindrome");
        }
        
       
        sc.close();
    }
}