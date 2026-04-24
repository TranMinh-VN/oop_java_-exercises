package part7_solid.quanli_benhvien;

/**
 * Exception khi hồ sơ y tế không hợp lệ
 */
public class InvalidMedicalRecordException extends Exception {
    public InvalidMedicalRecordException(String message) {
        super(message);
    }
}
