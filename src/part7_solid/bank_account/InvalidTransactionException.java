package part7_solid.bank_account;

/**
 * Exception khi giao dịch không hợp lệ
 */
public class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}
