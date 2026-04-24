package part7_solid.quanli_thuvien;

/**
 * Exception khi sách đã được mượn
 */
public class BookAlreadyBorrowedException extends Exception {
    public BookAlreadyBorrowedException(String message) {
        super(message);
    }
}


