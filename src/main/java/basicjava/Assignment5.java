
package basicjava;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Enter voter age: ");
        age = input.nextInt();
        if(age>=18){
            System.out.println("valid voter");
        }
        else{
            System.out.println("invalid voter");
        }
        
    }
 
}
