package basicjava;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                           Select one option:
                           1.Bengali
                           2.Hindi
                           3.Urdu
                           any degit for English
                """);
       int option = input.nextInt();
        switch (option) {
            case 1 -> System.out.println("Selected language is Bengali.");
            case 2 -> System.out.println("Selected language is Hindi.");
            case 3 -> System.out.println("Selected language is Urdu.");
            default -> System.out.println("Selected language is English.");
        }
    }
}
