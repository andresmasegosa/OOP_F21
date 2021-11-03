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

    public boolean pay(CreditCard card){
        double totalPrice=0;
         for (Product product: products){
             totalPrice+=product.getPrice();
         }

         return card.chargeToTheCreditCard(totalPrice);
    }

    public boolean pay(PayPal payPal){
        double totalPrice=0;
        for (Product product: products){
            totalPrice+=product.getPrice();
        }

        return payPal.processPayment(totalPrice);
    }

}
