package part7_solid.quanli_donhang;

/**
 * Exception khi đơn hàng không hợp lệ
 */
public class InvalidOrderException extends Exception {
    public InvalidOrderException(String message) {
        super(message);
    }
}


