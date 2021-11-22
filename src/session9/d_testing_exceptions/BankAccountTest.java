package session9.d_testing_exceptions;

import org.junit.jupiter.api.Test;
import session9.b_customexceptions.*;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void getBalance() {
        BankAccount bankAccount = new BankAccount(100);
        assertEquals(100,bankAccount.getBalance());
    }

    @Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.withdraw(10);
        assertEquals(90,bankAccount.getBalance());
    }

    @Test
    void withdrawNegativeWithDrawException() {
        BankAccount bankAccount = new BankAccount(100);
        assertThrows(NegativeAmountException.class,
                ()-> {bankAccount.withdraw(-10);}
        );

        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void withdrawInsufficientFundsException() {
        BankAccount bankAccount = new BankAccount(100);

        InsufficientFundsException fundsException =
                assertThrows(InsufficientFundsException.class,
                        ()->{bankAccount.withdraw(1000);});

        assertEquals(900,fundsException.getDeficit());

        assertEquals(100, bankAccount.getBalance());

    }

    @Test
    void deposit() {
        BankAccount bankAccount = new BankAccount(200);
        bankAccount.deposit(42);
        assertEquals(242, bankAccount.getBalance());
    }

    @Test
    void depositThrowsNegativeQuantityWithException() {
        BankAccount bankAccount = new BankAccount(200);
        assertThrows(NegativeDepositException.class, ()->{bankAccount.deposit(-100);});
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    void depositThrowsTooLargeWithException() {
        BankAccount bankAccount = new BankAccount(10000001);
        assertThrows(WarningLargeDeposit.class, ()->{bankAccount.deposit(100001);});
        assertEquals(10100002, bankAccount.getBalance());
    }

    /**
     * Exercise:
     *
     * Write tests for deposit method:
     *  - Test that deposit method works well in standard conditions.
     *  - Test that deposit method throws the corresponding exception if a negative quantity is being deposited.
     *  - Test that deposit method throws the corresponding exception if a too large quantity is being deposited.
     */

    
}