package part7_solid.quanli_hangkhong;

/**
 * Exception khi đặt vé không hợp lệ
 */
public class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}
