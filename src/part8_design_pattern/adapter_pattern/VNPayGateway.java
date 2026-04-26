package part8_design_pattern.adapter_pattern;

/**
 * Class VNPayGateway (HỆ THỐNG CŨ - KHÔNG TƯƠNG THÍCH)
 * Mô tả: Cổng thanh toán VNPay với interface riêng
 * Sinh viên KHÔNG cần chỉnh sửa class này
 */
public class VNPayGateway {
    private String merchantId;
    private boolean active;

    public VNPayGateway(String merchantId) {
        this.merchantId = merchantId;
        this.active = false;
        System.out.println("VNPay Gateway được khởi tạo với Merchant ID: " + merchantId);
    }

    public void connect() {
        active = true;
        System.out.println("VNPay: Đã kết nối thành công");
    }

    public void disconnect() {
        active = false;
        System.out.println("VNPay: Đã ngắt kết nối");
    }

    public boolean sendPaymentRequest(int amountInVND, String transactionId) {
        if (!active) {
            System.out.println("VNPay: Lỗi - Chưa kết nối đến gateway");
            return false;
        }
        System.out.println("VNPay: Đang xử lý giao dịch " + transactionId + " - Số tiền: " + amountInVND + " VND");
        System.out.println("VNPay: Thanh toán thành công!");
        return true;
    }

    public boolean isActive() {
        return active;
    }

    public String getMerchantInfo() {
        return "VNPay Gateway [Merchant: " + merchantId + ", Active: " + active + "]";
    }
}
