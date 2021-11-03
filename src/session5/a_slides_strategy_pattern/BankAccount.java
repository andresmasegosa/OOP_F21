package session5.a_slides_strategy_pattern;

public class BankAccount {
    private double balance;
    private InterestStrategy interestStrategy;

    public BankAccount(double balance, InterestStrategy interestStrategy) {
        this.balance = balance;
        this.interestStrategy = interestStrategy;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void accrueInterest() {
        this.balance = this.balance + interestStrategy.getInterest(this.balance);
    }
}
