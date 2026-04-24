package part7_solid.quanli_benhvien;

/**
 * Exception khi bệnh nhân không hợp lệ
 */
public class InvalidPatientException extends Exception {
    public InvalidPatientException(String message) {
        super(message);
    }
}
