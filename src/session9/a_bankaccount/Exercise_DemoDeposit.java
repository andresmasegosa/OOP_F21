package session9.a_bankaccount;

import java.util.Scanner;

/**
 * Introduce changes in the deposit method of the BankAccount to avoid that a negative quantity can be deposited.
 */
public class Exercise_DemoDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(100);

        while (true) {
            System.out.println("Current Account Balance: "+account.getBalance());

            System.out.println("Enter an amount to deposit:");
            int amount = scanner.nextInt();

            try {
                account.deposit(amount);
            } catch (IllegalArgumentException e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }
}
