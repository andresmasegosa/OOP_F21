package session9.c_checked_exceptions;


public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new NegativeAmountException();
        }
        if (amount >= balance) {
            int deficit = amount - balance;
            throw new InsufficientFundsException(deficit);
        }
        balance = balance - amount;
    }
}