package part7_solid.quanli_benhvien;

/**
 * Exception khi thông tin y tế không đầy đủ
 */
public class IncompleteMedicalInfoException extends Exception {
    public IncompleteMedicalInfoException(String message) {
        super(message);
    }
}
