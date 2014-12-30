/** Challenge Activity 1 - Product Catalog Demo II
 * 
 * In this activity, we will extend the product catalog demo example to include
 * a new product:
 * 
 * 1. Movie.java with:
 *    - Constructor
 *    - getRunlength() / setRunlength() methods
 *    - override the getType() method
 * 2. And adjust the main() method to include the movie 
 *    "Terminator" for 14.95, run length 180 minutes in the product catalog. 
 * 
 * SAMPLE RUN w/OUTPUT:
 
NAME      	     PRICE	TYPE      
Moby Dick 	   19.99	Book      
Cool Jeans	   59.99	Pants     
Lead Pencil	    1.99	Product   
Terminator	   14.95	Movie     
 
*/
package productcatalogdemo;

import java.util.ArrayList;

public class ProductCatalogDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Book("Moby Dick",19.99, "12345",1250));
        products.add(new Pants("Cool Jeans", 59.99, 34,30));
        products.add(new Product("Lead Pencil", 1.99));
        
        System.out.printf("%-10s\t%10s\t%-10s\n","NAME","PRICE","TYPE");
        for (Product p : products) {
            System.out.printf("%-10s\t%8.2f\t%-10s\n", p.getName(), p.getPrice(), p.getType());
            
        }
        
    }
}
