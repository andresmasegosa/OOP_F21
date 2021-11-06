package session5.solutions.a_exercise_strategy_pattern_solution;

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

    public boolean pay(PaymentMethod paymentMethod){
        double totalPrice=0;
        for (int i = 0; i < numberOfProducts; i++) {
            totalPrice+=products[i].getPrice();
        }

        return paymentMethod.pay(totalPrice);
    }

}
