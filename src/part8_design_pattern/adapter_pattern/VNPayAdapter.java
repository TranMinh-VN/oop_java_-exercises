package part8_design_pattern.adapter_pattern;

/**
 * Class VNPayAdapter
 * Mô tả: Adapter chuyển đổi VNPayGateway để tương thích với PaymentProcessor
 *
 * Thuộc tính:
 * - vnpayGateway: VNPayGateway - Instance của VNPay gateway cần được adapt
 * - transactionCounter: int - Đếm số giao dịch để tạo transaction ID
 *
 * Yêu cầu:
 * 1. Implement interface PaymentProcessor
 * 2. Constructor nhận vào VNPayGateway
 *    - Khởi tạo transactionCounter = 0
 *    - Gọi vnpayGateway.connect() để kết nối
 * 3. Implement processPayment(double amount, String currency):
 *    - Chuyển đổi amount sang VND nếu currency không phải "VND"
 *      (Quy ước: 1 USD = 24000 VND, 1 EUR = 26000 VND)
 *    - Chuyển đổi amount sang int (làm tròn)
 *    - Tạo transactionId = "VNPAY_TXN_" + (++transactionCounter)
 *    - Gọi vnpayGateway.sendPaymentRequest(amountInVND, transactionId)
 *    - Return kết quả
 * 4. Implement getProcessorName(): return "VNPay Adapter"
 * 5. Implement isConnected(): return vnpayGateway.isActive()
 * 6. Override toString(): return "VNPayAdapter[" + vnpayGateway.getMerchantInfo() + "]"
 */
public class VNPayAdapter implements PaymentProcessor {
    private VNPayGateway vnpayGateway;
    private int transactionCounter;

    public VNPayAdapter(VNPayGateway vnpayGateway) {
        this.vnpayGateway = vnpayGateway;
        this.transactionCounter = 0;
        this.vnpayGateway.connect();
    }


}
