

import java.util.Scanner;
public class primeN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       
        for(int i = 2; i <= a; i++){
          boolean f=true;
          for(int j = 2;j<=i/2;j++){

            if(i % j == 0){
                f = false;
                break;
            }
            

            }
            if(f){
                System.out.println(i + " is a prime number");
            }
    }
        sc.close();
    }
}
