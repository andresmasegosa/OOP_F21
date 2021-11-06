package session5.solutions.a_exercise_strategy_pattern_solution;

public class PayPal {

    private String email;
    private double balance;

    public PayPal(String email, int initialBalance) {
        this.email = email;
        this.balance = initialBalance;
    }

    boolean processPayment(double quantity){
        if (this.balance>quantity){
            this.balance-=quantity;
            return true;
        }else {
            return false;
        }
    }

}
