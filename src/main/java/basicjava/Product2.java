//Assignment = 2
package basicjava;
import java.text.DecimalFormat;
public class Product2 {
    public static void main(String[] args){
        int id;
        String title, description, category, price_name;
        double price;
        id = 101;
        title = "iphone15";
        price = 1895;
        DecimalFormat df = new DecimalFormat("0.##");
        price_name = "euros";
        description = "perfect with best image quality";
        category = "phone";
        System.out.println("id : " + id +
                "\ntitle : " + title +
                "\ndescription : " + description + 
                 "\nprice : " +df.format(price)+" "+ price_name +
                "\ncategory = " + category
        );
    }
}

