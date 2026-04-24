package part7_solid.bank_account;

/**
 * Exception khi tài khoản bị khóa
 */
public class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}
