package ex44;
import java.util.*;
import java.io.*;
import com.google.gson.*;
/*
1. Get product name from user
2. If the product is not found, loop back to 1
3. If it is found, print the name price and quantity to the command line
 */

class ProductList
{
    List<Products> products;
}
class Products
{
    String name;
    double price;
    int quantity;
}


public class App {
    public static void main( String[] args )
    {

        Gson gson=new Gson();
        try (Reader reader= new FileReader("exercise44_input.json")) {
            ProductList product = gson.fromJson(reader,ProductList.class);

            System.out.println(product);

        }catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
