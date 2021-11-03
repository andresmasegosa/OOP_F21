package session5.exercises.a_exercise_strategy_pattern;

public class PayPalPayment implements PaymentStrategy{

    PayPal paypal;

    public PayPalPayment(PayPal paypal) {
        this.paypal = paypal;
    }

    public boolean pay(double quantity) {
        return paypal.processPayment(quantity);
    }
}
