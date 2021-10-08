package session2.b_encapsultation.bank;


public class BankAccount {

    public int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.withdraw(75);
        account.balance = 500_000;
    }
}