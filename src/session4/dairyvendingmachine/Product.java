package session4.dairyvendingmachine;

public class Product {
     protected final String name;
     private double price;

     public Product(String name) {
        this.name = name;
         this.price = price;
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
