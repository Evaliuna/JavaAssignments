package basicjava;
import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int m, n,sum=0;
            System.out.print("Enter the starting number : ");
            m = input.nextInt();
            System.out.print("Enter the ending number :");
            n = input.nextInt();
           
            for(int i=m; i<=n;i++){
                if(i%2==0) continue;
                sum += i;
            }
            System.out.println("Sum of the numbers are : " +sum);
        }
    }
}
