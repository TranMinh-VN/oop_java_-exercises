package part7_solid.bank_account;

/**
 * Exception khi tài khoản không hợp lệ
 */
public class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}
