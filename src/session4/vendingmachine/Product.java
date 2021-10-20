package session4.vendingmachine;

public class Product {
     private String name;
     private double price;

     public Product(String name) {
        this.name = name;
    }

     public String getName() {
        return name;
    }

     public double getPrice() {
        return price;
    }

     public void setPrice(double price) {
        this.price = price;
    }
}
