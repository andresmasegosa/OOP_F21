package session2.b_encapsultation;

import session2.b_encapsultation.bank.BankAccount;

public class BankAccountDemoWorld {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.withdraw(75);
        account.balance = 500_000;
    }

}
