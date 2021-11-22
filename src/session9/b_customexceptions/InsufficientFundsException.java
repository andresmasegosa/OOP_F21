package session9.b_customexceptions;


public class InsufficientFundsException extends RuntimeException {
    private int deficit;

    public InsufficientFundsException(int deficit) {
        this.deficit = deficit;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public int getDeficit() {
        return deficit;
    }
}
