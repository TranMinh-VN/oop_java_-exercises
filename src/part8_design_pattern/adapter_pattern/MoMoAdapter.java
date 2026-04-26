package part8_design_pattern.adapter_pattern;

/**
 * Class MoMoAdapter
 * Mô tả: Adapter chuyển đổi MoMoAPI để tương thích với PaymentProcessor
 *
 * Thuộc tính:
 * - momoAPI: MoMoAPI - Instance của MoMo API cần được adapt
 *
 * Yêu cầu:
 * 1. Implement interface PaymentProcessor
 * 2. Constructor nhận vào MoMoAPI
 *    - Gọi momoAPI.initialize() để khởi tạo
 * 3. Implement processPayment(double amount, String currency):
 *    - Gọi momoAPI.createTransaction(amount, currency) để tạo transaction
 *    - Kiểm tra nếu transaction bắt đầu bằng "ERROR":
 *      + In thông báo lỗi
 *      + Return false
 *    - Nếu OK: gọi momoAPI.executeTransaction(transactionId) và return kết quả
 * 4. Implement getProcessorName(): return "MoMo Adapter"
 * 5. Implement isConnected(): return momoAPI.isInitialized()
 * 6. Override toString(): return "MoMoAdapter[" + momoAPI.getAPIInfo() + "]"
 */
public class MoMoAdapter implements PaymentProcessor {
    private MoMoAPI momoAPI;

    public MoMoAdapter(MoMoAPI momoAPI) {
        this.momoAPI = momoAPI;
        this.momoAPI.initialize();
    }


}
