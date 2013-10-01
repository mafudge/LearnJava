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
