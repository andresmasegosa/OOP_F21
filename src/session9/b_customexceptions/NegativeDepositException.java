package session9.b_customexceptions;

public class NegativeDepositException extends RuntimeException{
    private String msg;

    public NegativeDepositException(String msg) {
        this.msg = msg;
    }

    public NegativeDepositException(String message, String msg) {
        super(message);
        this.msg = msg;
    }

    public NegativeDepositException(String message, Throwable cause, String msg) {
        super(message, cause);
        this.msg = msg;
    }

    public NegativeDepositException(Throwable cause, String msg) {
        super(cause);
        this.msg = msg;
    }

    public NegativeDepositException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String msg) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.msg = msg;
    }
}
