package part8_design_pattern.adapter_pattern;

/**
 * Interface PaymentProcessor
 * Mô tả: Interface chuẩn mà hệ thống của chúng ta sử dụng
 * Sinh viên KHÔNG cần chỉnh sửa interface này
 */
public interface PaymentProcessor {
    /**
     * Xử lý thanh toán
     * @param amount - double - Số tiền cần thanh toán
     * @param currency - String - Đơn vị tiền tệ (VND, USD, EUR...)
     * @return boolean - true nếu thành công, false nếu thất bại
     */
    boolean processPayment(double amount, String currency);

    /**
     * Lấy tên của processor
     * @return String - Tên processor
     */
    String getProcessorName();

    /**
     * Kiểm tra trạng thái kết nối
     * @return boolean - true nếu đã kết nối, false nếu chưa
     */
    boolean isConnected();
}
