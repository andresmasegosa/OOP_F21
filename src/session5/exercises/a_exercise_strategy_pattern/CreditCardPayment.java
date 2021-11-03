package session5.exercises.a_exercise_strategy_pattern;

public class CreditCardPayment implements PaymentStrategy {

    CreditCard card;

    public CreditCardPayment(CreditCard card) {
        this.card = card;
    }

    public boolean pay(double quantity){
        return card.chargeToTheCreditCard(quantity);
    }
}
