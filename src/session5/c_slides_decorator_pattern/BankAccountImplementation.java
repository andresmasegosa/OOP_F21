package session5.c_slides_decorator_pattern;

public class BankAccountImplementation implements BankAccount{
    String owner;
    double balance;

    public BankAccountImplementation(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount<balance) {
            balance -= amount;
        }else{
            System.out.println("ERROR!!");
        }
    }

    @Override
    public void transferTo(double quantity, BankAccount otherAccount) {
        if (quantity<balance) {
            balance -= quantity;
            otherAccount.deposit(quantity);
        }else{
            System.out.println("ERROR!!");
        }
    }

}
