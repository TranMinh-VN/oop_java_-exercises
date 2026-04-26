package part8_design_pattern.adapter_pattern;

/**
 * Class MoMoAPI (HỆ THỐNG CŨ - KHÔNG TƯƠNG THÍCH)
 * Mô tả: API thanh toán MoMo với interface riêng
 * Sinh viên KHÔNG cần chỉnh sửa class này
 */
public class MoMoAPI {
    private String apiKey;
    private String secretKey;
    private boolean initialized;
    private static int count = 0;

    public MoMoAPI(String apiKey, String secretKey) {
        this.apiKey = apiKey;
        this.secretKey = secretKey;
        this.initialized = false;
        System.out.println("MoMo API được khởi tạo");
    }

    public void initialize() {
        initialized = true;
        System.out.println("MoMo: API đã được khởi tạo thành công với key: " + apiKey);
    }

    public String createTransaction(double money, String currency) {
        if (!initialized) {
            return "ERROR: API chưa được khởi tạo";
        }

        // Chuyển đổi sang VND nếu cần
        double amountInVND = money;
        if (!currency.equals("VND")) {
            System.out.println("MoMo: Đang chuyển đổi " + money + " " + currency + " sang VND...");
            amountInVND = money * 24000; // Giả sử tỷ giá 1 USD = 24000 VND
        }

        count += 1;
        System.out.println("MoMo: Tạo giao dịch - Số tiền: " + amountInVND + " VND");
        return "MOMO_TXN_" + count;
    }

    public boolean executeTransaction(String transactionId) {
        if (!initialized) {
            System.out.println("MoMo: Lỗi - API chưa được khởi tạo");
            return false;
        }
        System.out.println("MoMo: Đang thực thi giao dịch " + transactionId);
        System.out.println("MoMo: Giao dịch hoàn tất!");
        return true;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public String getAPIInfo() {
        return "MoMo API [Key: " + apiKey + ", Initialized: " + initialized + "]";
    }
}
