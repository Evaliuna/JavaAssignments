package basicjava;

import java.util.Scanner;
 public class Assignment14{
    public static void main(String[]args){
      try(Scanner input = new Scanner(System.in)){
    
        int m, n, count =0;
        System.out.println("Enter starting and ending number: ");
        m = input.nextInt();
        n= input.nextInt();
        System.out.println("Palindrome numbers betwwen them are : ");
        for(int i= m; i<=n;i++){
            int reversed= 0;
            int temp = i;
            int original=i;
            while(temp!=0){
               int  remaining= temp%10;
                reversed = (reversed*10)+remaining;
                temp = temp/10;
            }
            if(reversed==original){
                System.out.println(original);
                count++;
            
        }
        }
        System.out.println("Total Palindrome Numbers are : "+count);
        
        
    }
}
}