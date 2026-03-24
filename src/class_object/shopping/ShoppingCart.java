package class_object.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Lớp ShoppingCart quản lý một tập hợp các CartItem.
 * Nó chứa logic nghiệp vụ chính cho việc thêm, xóa, cập nhật các món hàng
 * và tính toán tổng giá trị của giỏ hàng.
 */
public class ShoppingCart {
    private final List<CartItem> items;

    /**
     * Hàm khởi tạo cho một ShoppingCart.
     */
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    /**
     * Thêm một sản phẩm vào giỏ hàng.
     * Logic cần thực hiện:
     * 1. Kiểm tra xem sản phẩm (product) được thêm vào đã tồn tại trong danh sách 'items' hay chưa.
     * - Gợi ý: Duyệt qua danh sách 'items' và so sánh từng 'product' trong đó với 'product' đầu vào.
     * Sử dụng phương thức .equals() đã được định nghĩa sẵn trong lớp Product.
     * 2. Nếu sản phẩm đã tồn tại:
     * - Lấy ra CartItem tương ứng và gọi phương thức increaseQuantity() để tăng số lượng.
     * 3. Nếu sản phẩm chưa tồn tại:
     * - Tạo một đối tượng CartItem mới với sản phẩm và số lượng được cung cấp.
     * - Thêm CartItem mới này vào danh sách 'items'.
     * @param product Sản phẩm cần thêm.
     * @param quantity Số lượng cần thêm.
     */
    public void addProduct(Product product, int quantity) {
        // TODO: Học viên hoàn thiện hàm này


    }

    /**
     * Cập nhật số lượng cho một sản phẩm trong giỏ.
     * @param product Sản phẩm cần cập nhật.
     * @param newQuantity Số lượng mới.
     */
    public void updateQuantity(Product product, int newQuantity) {
        Optional<CartItem> item = findItemByProduct(product);
        if (item.isPresent()) {
            if (newQuantity > 0) {
                item.get().setQuantity(newQuantity);
            } else {
                // Nếu số lượng mới là 0 hoặc âm, xóa sản phẩm khỏi giỏ
                removeProduct(product);
            }
        }
    }

    /**
     * Xóa một sản phẩm khỏi giỏ hàng.
     * @param product Sản phẩm cần xóa.
     */
    public void removeProduct(Product product) {
        items.removeIf(item -> item.getProduct().equals(product));
    }

    /**
     * Tính tổng giá trị của tất cả các món hàng trong giỏ.
     * Logic cần thực hiện:
     * 1. Khởi tạo một biến tổng (ví dụ: total) với giá trị 0.
     * 2. Duyệt qua từng CartItem trong danh sách 'items'.
     * 3. Với mỗi CartItem, gọi phương thức getSubtotal() của nó và cộng kết quả vào biến tổng.
     * 4. Trả về biến tổng cuối cùng.
     * @return Tổng tiền của tất cả các món hàng trong giỏ hàng.
     */
    public double calculateTotal() {
        // TODO: Học viên hoàn thiện hàm này
        return 0; // Xóa dòng này và viết code của bạn
    }

    /**
     * Hiển thị chi tiết các món hàng trong giỏ.
     */
    public void displayCart() {
        System.out.println("\n--- CHI TIẾT GIỎ HÀNG ---");
        if (items.isEmpty()) {
            System.out.println("Giỏ hàng của bạn đang trống.");
        } else {
            System.out.printf("%-20s | %-10s | %-15s | %-15s\n", "Sản phẩm", "Số lượng", "Đơn giá", "Thành tiền");
            System.out.println("--------------------------------------------------------------------");
            for (CartItem item : items) {
                Product p = item.getProduct();
                System.out.printf("%-20s | %-10d | %,.0f VND | %,.0f VND\n",
                        p.getName(), item.getQuantity(), p.getPrice(), item.getSubtotal());
            }
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("TỔNG CỘNG: %,.0f VND\n", calculateTotal());
        }
        System.out.println("--------------------------");
    }

    /**
     * Trả về một bản sao của danh sách các món hàng để đảm bảo tính đóng gói.
     * @return Một danh sách các CartItem.
     */
    public List<CartItem> getItems() {
        return new ArrayList<>(items); // Trả về một bản sao
    }

    /**
     * Phương thức private hỗ trợ tìm kiếm một CartItem dựa trên Product.
     * @param product Sản phẩm cần tìm.
     * @return Optional chứa CartItem nếu tìm thấy.
     */
    private Optional<CartItem> findItemByProduct(Product product) {
        return items.stream()
                .filter(item -> item.getProduct().equals(product))
                .findFirst();
    }
}
