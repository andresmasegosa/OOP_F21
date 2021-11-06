package session5.solutions.a_exercise_strategy_pattern_solution;

public class PaymentByCrediCard implements PaymentMethod{
    CreditCard card;

    public PaymentByCrediCard(CreditCard card) {
        this.card = card;
    }

    @Override
    public boolean pay(double quantity) {
        return card.chargeToTheCreditCard(quantity);
    }
}
