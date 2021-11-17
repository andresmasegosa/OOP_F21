package session9.a_bankaccount;

import java.util.Scanner;

public class DemoWithDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(100);

        while (true) {
            System.out.println("Current Account Balance: "+account.getBalance());

            System.out.println("Enter an amount to withdraw:");
            int amount = scanner.nextInt();

            try {
                account.withdraw(amount);
            } catch (IllegalArgumentException e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }
}
