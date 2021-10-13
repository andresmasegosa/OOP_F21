package session2.b_encapsultation.bank;

public class BankAccountDemoPackage {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.withdraw(75);
        account.balance = 500_000;
    }

}
