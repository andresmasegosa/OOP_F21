package session5.exercises.a_exercise_strategy_pattern;

public class PayPal {

    private String email;
    private double balance;

    public PayPal(String email, int initialBalance) {
        this.email = email;
        this.balance = initialBalance;
    }

    public boolean processPayment(double quantity){
        if (this.balance>quantity){
            this.balance-=quantity;
            return true;
        }else {
            return false;
        }
    }

}
