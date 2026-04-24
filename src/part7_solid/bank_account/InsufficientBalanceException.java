package part7_solid.bank_account;

/**
 * Exception khi số dư không đủ
 */
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
