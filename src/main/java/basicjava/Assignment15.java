package basicjava;
import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int m,n, count = 0;
            System.out.print("Enter starting number: ");
            m = input.nextInt();
            System.out.print("Enter ending number: ");
            n = input.nextInt();
            
            for(int i = m; i<=n; i++){
                int temp = i;
                int armstrong = 0;
                while(temp!=0){
                    int r= temp%10;
                    armstrong += (r*r*r);
                    temp = temp/10;
                }
                if(armstrong == i){
                    System.out.println(i);
                    count++;
                }
            }
            System.out.println("The numbers of armstrong digits between "+m+" and "+n+" are: "+count);
        }
    }
}
