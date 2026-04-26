package part8_design_pattern.adapter_pattern;

/**
 * Class PaymentService
 * Mô tả: Service xử lý thanh toán sử dụng PaymentProcessor interface
 * Sinh viên KHÔNG cần chỉnh sửa class này
 */
public class PaymentService {
    private PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
        System.out.println("PaymentService được khởi tạo với: " + processor.getProcessorName());
    }

    public void setProcessor(PaymentProcessor processor) {
        this.processor = processor;
        System.out.println("Đã chuyển sang processor: " + processor.getProcessorName());
    }

    public boolean makePayment(double amount, String currency) {
        System.out.println("\n--- Bắt đầu thanh toán ---");
        System.out.println("Processor: " + processor.getProcessorName());
        System.out.println("Trạng thái kết nối: " + (processor.isConnected() ? "Đã kết nối" : "Chưa kết nối"));

        if (!processor.isConnected()) {
            System.out.println("Lỗi: Processor chưa sẵn sàng!");
            return false;
        }

        boolean result = processor.processPayment(amount, currency);
        System.out.println("Kết quả: " + (result ? "THÀNH CÔNG" : "THẤT BẠI"));
        System.out.println("--- Kết thúc thanh toán ---\n");

        return result;
    }

    public void showProcessorInfo() {
        System.out.println("Processor hiện tại: " + processor.toString());
    }
}
