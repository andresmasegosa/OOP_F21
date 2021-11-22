package session9.d_testing_exceptions;


import org.junit.jupiter.api.function.Executable;
import session9.b_customexceptions.BankAccount;

public class TestWithDraw implements Executable {
    BankAccount bankAccount;

    public TestWithDraw(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void execute() throws Throwable {
        bankAccount.withdraw(-10);
    }
}
