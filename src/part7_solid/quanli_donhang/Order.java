package part7_solid.quanli_donhang;

/**
 * CLASS 2: Order - Đại diện cho một đơn hàng
 *
 * THUỘC TÍNH:
 * - orderId: String - Mã đơn hàng (duy nhất)
 * - customerId: String - Mã khách hàng
 * - items: java.util.List<OrderItem> - Danh sách sản phẩm trong đơn (sử dụng inner class OrderItem)
 * - totalAmount: double - Tổng tiền đơn hàng
 * - status: String - Trạng thái đơn hàng (PENDING, PAID, CANCELLED)
 * - discountPercent: double - Phần trăm giảm giá cho toàn đơn (0-100)
 *
 * INNER CLASS: OrderItem
 * - product: Product - Sản phẩm
 * - quantity: int - Số lượng
 *
 * YÊU CẦU:
 * 1. Implement các interface: Priceable, Displayable, Validatable, Payable
 * 2. Constructor nhận các tham số: orderId, customerId
 *    - Khởi tạo items là ArrayList rỗng
 *    - totalAmount = 0
 *    - status = "PENDING"
 *    - discountPercent = 0
 * 3. Phương thức addItem(Product product, int quantity):
 *    - Kiểm tra product.isInStock()
 *    - Kiểm tra quantity > 0 và quantity <= product.getStockQuantity()
 *    - Thêm OrderItem mới vào items
 *    - Gọi calculateTotal() để cập nhật totalAmount
 *    - Throw OutOfStockException nếu không đủ hàng
 * 4. Phương thức removeItem(String productId):
 *    - Xóa sản phẩm khỏi items dựa vào productId
 *    - Cập nhật lại totalAmount
 * 5. Implement calculateTotal():
 *    - Tính tổng: sum(product.getPrice() * quantity) cho mỗi item
 *    - Áp dụng giảm giá: total * (100 - discountPercent) / 100
 *    - Cập nhật totalAmount và trả về
 * 6. Implement applyDiscount(double discountPercent):
 *    - Set discountPercent cho đơn hàng (0-100)
 *    - Gọi calculateTotal() để cập nhật
 *    - Trả về totalAmount mới
 * 7. Implement getDisplayInfo():
 *    - Format: "Order ID: [orderId] | Customer: [customerId] | Items: [số lượng items] | Total: [totalAmount] VND | Status: [status] | Discount: [discountPercent]%"
 * 8. Implement isValid():
 *    - orderId không null và không rỗng
 *    - customerId không null và không rỗng
 *    - totalAmount >= 0
 *    - status là một trong: PENDING, PAID, CANCELLED
 * 9. Implement pay():
 *    - Kiểm tra status phải là PENDING
 *    - Kiểm tra items không rỗng
 *    - Giảm stock cho từng sản phẩm trong items
 *    - Set status = "PAID"
 *    - Throw PaymentFailedException nếu không thỏa điều kiện
 * 10. Implement isPaid(): trả về true nếu status == "PAID"
 * 11. Phương thức cancel():
 *     - Chỉ cancel được khi status == "PENDING"
 *     - Set status = "CANCELLED"
 *     - Throw InvalidOrderException nếu không thể cancel
 * 12. Override toString() trả về getDisplayInfo()
 * 13. Tạo các getter cho tất cả thuộc tính
 */
public class Order implements Priceable, Displayable, Validatable, Payable {
    // TODO: Sinh viên hoàn thiện class này

}

