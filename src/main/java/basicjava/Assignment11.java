package basicjava;
import java.util.Scanner;

public class Assignment11 {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int n, fact=1;
          System.out.println("Enter the number: ");
          n = input.nextInt();
          
          for(int i = 1;i<=n;i++){
              fact *=i;
          }
          System.out.println(fact);
    }     
}
