
import java.util.Scanner;
public class amstrongN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       
        for(int i = 0; i < a; i++){
            int sum = 0, temp, r;
            int cd = 0;
            int org = i;
            temp = i;
            while(org != 0){
            cd++;
            org/=10;
        }
            while (temp != 0) {
            r = temp % 10;
            sum += Math.pow(r, cd);
            temp /= 10;
        }

            if (sum == i) {
            System.out.println(i + " is an Armstrong number.");
        } 
    }
        sc.close();
    }
}
