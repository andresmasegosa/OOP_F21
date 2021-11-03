package session5.c_slides_decorator_pattern;

public interface BankAccount {
    String getOwner();
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    void transferTo(double quantity, BankAccount otherAccount);
}
