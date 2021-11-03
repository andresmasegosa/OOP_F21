package session5.solutions.a_exercise_strategy_pattern_solution;


public class Demo {
    public static void main(String[] args) {

        Product iphone = new Product("Iphone", 10000);
        Product gloves = new Product("gloves", 500);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(iphone);
        shoppingCart.addProduct(gloves);

        CreditCard card = new CreditCard("Andres", 12345678, 123, 30_000);
        PaymentMethod paymentMethod = new PaymentByCrediCard(card);

        if (shoppingCart.pay(paymentMethod)){
            System.out.println("Successful Payment");
        }else{
            System.out.println("Wrong Payment");
        }
    }
}
