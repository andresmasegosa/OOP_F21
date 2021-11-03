package session5.exercises.a_exercise_strategy_pattern;

public class Demo {
    public static void main(String[] args) {

        // Products
        Product iphone = new Product("Iphone", 10000);
        Product gloves = new Product("gloves", 500);

        // ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(iphone);
        shoppingCart.addProduct(gloves);

        // Payment Types
        CreditCard card = new CreditCard("Andres", 12345678, 123, 30_000);
        PayPal payPal = new PayPal("thorbensen@gmail.com", 30_000);

        PaymentStrategy paymentStrategy1 = new PayPalPayment(payPal);
        PaymentStrategy paymentStrategy2 = new CreditCardPayment(card);

        if (shoppingCart.pay(paymentStrategy1)) {
            System.out.println("Payment successfull");
        } else {
            System.out.println("Payment Unsuccessful");
        }

    }
}
