package solid.quanli_donhang;

/**
 * CLASS 1: Product - Đại diện cho một sản phẩm
 *
 * THUỘC TÍNH:
 * - productId: String - Mã sản phẩm (duy nhất)
 * - productName: String - Tên sản phẩm
 * - price: double - Giá sản phẩm (phải > 0)
 * - stockQuantity: int - Số lượng tồn kho
 * - category: String - Danh mục sản phẩm
 *
 * YÊU CẦU:
 * 1. Implement các interface: Priceable, Displayable, Validatable
 * 2. Constructor nhận đầy đủ tham số (productId, productName, price, stockQuantity, category)
 * 3. Implement phương thức calculateTotal():
 *    - Trả về giá của 1 sản phẩm (chỉ trả về price)
 * 4. Implement phương thức applyDiscount(double discountPercent):
 *    - Kiểm tra discountPercent phải từ 0-100
 *    - Tính giá sau giảm: price * (100 - discountPercent) / 100
 *    - Trả về giá sau khi giảm
 * 5. Implement phương thức getDisplayInfo():
 *    - Format: "ID: [productId] | Name: [productName] | Price: [price] VND | Stock: [stockQuantity] | Category: [category]"
 * 6. Implement phương thức isValid():
 *    - productId không null và không rỗng
 *    - productName không null và không rỗng
 *    - price > 0
 *    - stockQuantity >= 0
 *    - category không null và không rỗng
 * 7. Phương thức reduceStock(int quantity):
 *    - Giảm số lượng tồn kho
 *    - Throw OutOfStockException nếu quantity > stockQuantity
 * 8. Phương thức increaseStock(int quantity):
 *    - Tăng số lượng tồn kho (quantity phải > 0)
 * 9. Phương thức isInStock():
 *    - Trả về true nếu stockQuantity > 0
 * 10. Override toString() trả về getDisplayInfo()
 * 11. Tạo các getter và setter cho tất cả thuộc tính
 */
public class Product implements Priceable, Displayable, Validatable {
    // TODO: Sinh viên hoàn thiện class này

}
