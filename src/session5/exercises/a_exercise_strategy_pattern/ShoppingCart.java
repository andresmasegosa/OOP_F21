package session5.exercises.a_exercise_strategy_pattern;

public class ShoppingCart{

    private Product[] products;
    private int numberOfProducts;

    public ShoppingCart() {
        this.products = new Product[100];
        this.numberOfProducts = 0;
    }

    public void addProduct(Product product){
        this.products[numberOfProducts++]=product;
    }

    public boolean pay(PaymentStrategy paymentStrategy){
        double totalPrice=0;
         for (int i = 0; i < numberOfProducts; i++){
             totalPrice+=products[i].getPrice();
         }

         return paymentStrategy.pay(totalPrice);
    }
}
