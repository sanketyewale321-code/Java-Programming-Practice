import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + name + " Rs." + price;
    }
}

public class ProductSorting {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Mobile", 20000));
        products.add(new Product(3, "Keyboard", 1000));
        products.add(new Product(4, "Mouse", 500));

        Collections.sort(products,
            Comparator.comparingDouble(p -> p.price));

        System.out.println("Products sorted by price:");

        for (Product p : products) {
            System.out.println(p);
        }
    }
}