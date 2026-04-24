package part7_solid.quanli_hangkhong;

/**
 * Exception khi chuyến bay đã khởi hành
 */
public class FlightDepartedException extends Exception {
    public FlightDepartedException(String message) {
        super(message);
    }
}
