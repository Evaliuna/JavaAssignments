
package basicjava;
import java.util.Scanner;
public class Product3 {
    public static void main(String[] args) {
        int id;
        String title, description, category;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("id : ");
        id = input.nextInt();
        input.nextLine();
        System.out.print("title : ");
        title = input.nextLine();
        System.out.print("price : ");
        price = input.nextDouble();
        input.nextLine();
        System.out.print("description : ");
        description = input.nextLine();
        System.out.print("category : ");
        category = input.nextLine();
        System.out.println(id + "\n" +title+"\n"+price+"\n"+description+"\n"+ category);
    }
}
