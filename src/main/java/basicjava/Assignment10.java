
package basicjava;
import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int sum = 0;
            for(int i = 1;i<=10;i++){
                sum+=i;
            }
            System.out.println("Sum of 1 to 10 is : "+sum);
        }
    }
}
