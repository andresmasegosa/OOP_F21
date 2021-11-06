package session5.solutions.a_exercise_strategy_pattern_solution;

public class PaymentByPayPal implements PaymentMethod{
    private PayPal payPal;

    public PaymentByPayPal(PayPal payPal) {
        this.payPal = payPal;
    }


    @Override
    public boolean pay(double quantity) {
        return this.payPal.processPayment(quantity);
    }

}
