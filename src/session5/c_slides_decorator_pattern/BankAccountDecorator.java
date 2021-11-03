package session5.c_slides_decorator_pattern;

public class BankAccountDecorator implements BankAccount{
    BankAccount account;

    public BankAccountDecorator(BankAccount bankAccount) {
        this.account = bankAccount;
    }

    @Override
    public String getOwner() {
        return account.getOwner();
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit: " + amount);
        account.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw: " + amount);
        account.deposit(amount);
    }

    @Override
    public void transferTo(double quantity, BankAccount otherAccount) {
        if (this.account.getOwner().equals(otherAccount.getOwner())){
            System.out.println("Transfering: "+quantity+" to the bank account of "+otherAccount.getOwner());
            account.transferTo(quantity, otherAccount);
        }
    }
}
