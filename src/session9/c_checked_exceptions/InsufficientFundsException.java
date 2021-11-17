package session9.c_checked_exceptions;


public class InsufficientFundsException extends Exception {
    private int deficit;

    public InsufficientFundsException(int deficit) {
        this.deficit = deficit;
    }

    public int getDeficit() {
        return deficit;
    }
}
