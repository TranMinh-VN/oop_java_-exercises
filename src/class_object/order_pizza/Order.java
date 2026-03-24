package class_object.order_pizza;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    // ... (các thuộc tính và constructor giữ nguyên) ...
    private int orderId;
    private List<Pizza> pizzas;
    private LocalDateTime orderTime;

    public Order(int orderId) {
        this.orderId = orderId;
        this.pizzas = new ArrayList<>();
        this.orderTime = LocalDateTime.of(2025, 9, 15, 22, 30, 59);
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    /**
     * TÍNH TỔNG GIÁ TRỊ CỦA TOÀN BỘ ĐƠN HÀNG.
     * Yêu cầu:
     * 1. Duyệt qua danh sách (list) các pizza trong đơn hàng.
     * 2. Với mỗi pizza, gọi phương thức `calculatePrice()` của nó để lấy giá.
     * 3. Cộng dồn giá của tất cả các pizza lại để ra được tổng hóa đơn.
     * 4. Trả về tổng số tiền cuối cùng.
     *
     * @return Tổng số tiền cần thanh toán cho cả đơn hàng.
     */
    public double calculateTotal() {
        // VIẾT CODE CỦA BẠN VÀO ĐÂY
        return 0; // Xóa dòng này đi khi bạn viết code
    }

    /**
     * IN HÓA ĐƠN CHI TIẾT CHO ĐƠN HÀNG.
     * Yêu cầu:
     * 1. In ra các thông tin chung: Mã đơn hàng.
     * 2. In ra phần chi tiết đơn hàng:
     * - Duyệt qua danh sách pizza.
     * - Với mỗi pizza, gọi phương thức `display()` của nó để hiển thị thông tin chi tiết.
     * - Nếu đơn hàng không có pizza nào, in ra thông báo "(Đơn hàng trống)".
     * 3. In ra tổng cộng số tiền phải trả bằng cách gọi phương thức `calculateTotal()`.
     * Gợi ý: Tham khảo mẫu output trong file Main.java để có định dạng chính xác.
     */
    public void printInvoice() {
        // VIẾT CODE CỦA BẠN VÀO ĐÂY
    }

    // ... (getter giữ nguyên) ...
    public int getOrderId() {
        return this.orderId;
    }
}
