package basicjava;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
      try(Scanner input = new Scanner(System.in)){
        int first, second, nth_fibo = 0,n;
       
        System.out.println("Which fibonacci number you want to see!");
        n = input.nextInt();
        if(n == 0 || n == 1){
            if(n == 0) System.out.println(0);
            else System.out.println(1);
        }
         first = 0;
         second = 1;
        
        for(int i=2;i<=n;i++){
            nth_fibo = first + second;
            first = second;
            second = nth_fibo;
            
   }
        System.out.println(n + "th fibonacci number is " + nth_fibo);
        
      }       
  } 
}