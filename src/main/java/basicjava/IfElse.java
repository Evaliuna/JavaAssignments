package basicjava;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int num;
            System.out.print("Enter a number : ");
            num = input.nextInt();
            if(num>0) System.out.println("Positive");
            else if(num<0) System.out.println("Negative");
            else System.out.println("Zero");
            
            if(num%2==0) System.out.println("Even");
            else System.out.println("Odd");
            
            char ch;
            System.out.print("Enter a character : ");
            ch = input.next().charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') System.out.println("Vowel");
            else System.out.println("Consonant");
            
            char letter;
            System.out.print("Enter a letter :");
            letter = input.next().charAt(0);
       
            if(letter>='a' && letter<='z') {
                System.out.println("small");
            } else {
                System.out.println("Capital");
            }
            
            int x, y;
            System.out.println("Enter 2 number : ");
            x = input.nextInt();
            y = input.nextInt();
            if(x>y) System.out.println("Maximum number is "+x+" Minimum Number is "+y);
            else System.out.println("Maximum number is "+y+" Minimum Number is : "+x);
            
            int year;
            System.out.println("Enter year to check leap year :");
            year = input.nextInt();
            if(year%400 == 0 || (year%4==0 && year%100!=0)){
                System.out.println("It is a leap year.");
            }
            else System.out.println("IT's not a leap year");
            
            int mark;
            System.out.print("Enter your mark : ");
            mark = input.nextInt();
            if(mark<40) System.out.println("Fail");
            else System.out.println("Pass");
        }
    }
}
