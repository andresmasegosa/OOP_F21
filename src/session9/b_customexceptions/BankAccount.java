package session9.b_customexceptions;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            NegativeAmountException exception = new NegativeAmountException();
            throw exception;
        }
        if (amount >= balance) {
            int deficit = amount - balance;
            throw new InsufficientFundsException(deficit);
        }
        balance = balance - amount;
    }

    public void deposit(int amount) {
        if (amount<0){
            throw new NegativeDepositException();
        }

        balance=balance+amount;

        if (amount>100_000){
            throw new WarningLargeDeposit();
        }

    }
}