package basicjava;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Have you completed your master? y/n");
        char ans1 = input.next().charAt(0);
        System.out.println("Are you fluent in English? y/n");
        char ans2 = input.next().charAt(0);
        
        if(ans1 == 'y' && ans2 == 'y'){
            System.out.println("You are eligible to for the job interview.");
        }
        else{
            System.out.println("Sorry, you are not eligible to for the job interview.");
        }
    }
}
