package session5.solutions.a_exercise_strategy_pattern_solution;

public class CreditCard {

    private String name;
    private int creditCardNumber;
    private int cvc;
    private double balance;

    public CreditCard(String name, int creditCardNumber, int cvc, int initialBalance) {
        this.name = name;
        this.creditCardNumber = creditCardNumber;
        this.cvc = cvc;
        this.balance = initialBalance;
    }

    public boolean chargeToTheCreditCard(double quantity){
        if (this.balance>quantity){
            this.balance-=quantity;
            return true;
        }else {
            return false;
        }
    }

}
