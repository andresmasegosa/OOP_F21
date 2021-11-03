package session5.c_slides_decorator_pattern;

public class Demo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccountImplementation("Andres", 10000);

        BankAccountDecorator bankAccountDecorator = new BankAccountDecorator(bankAccount);

        bankAccountDecorator.deposit(100);
        bankAccountDecorator.withdraw(50);


        BankAccount bankAccount2 = new BankAccountImplementation("Andres", 1000);
        bankAccountDecorator.transferTo(1000, bankAccount2);
    }
}
