package part4_tinh_ke_thua.quanli_san_pham;

/**
 * Class FoodProduct - Đại diện cho sản phẩm thực phẩm
 *
 * MÔ TẢ:
 * - FoodProduct là một loại Product
 * - Có 5 thuộc tính:
 *   + productId (String): Mã sản phẩm
 *   + name (String): Tên sản phẩm
 *   + basePrice (double): Giá gốc
 *   + stockQuantity (int): Số lượng tồn kho
 *   + shelfLifeDays (int): Hạn sử dụng (ngày)
 *
 * YÊU CẦU:
 * 1. Khai báo các thuộc tính với kiểu dữ liệu phù hợp
 * 2. Tạo constructor nhận 5 tham số
 * 3. Implement các phương thức:
 *    - getProductId(), getName(), getBasePrice(), getStockQuantity(): return thuộc tính tương ứng
 *
 *    - calculateFinalPrice(discountPercent):
 *        + Thực phẩm có thuế VAT 5%
 *        + Công thức: basePrice * (1 + 0.05) * (1 - discountPercent/100)
 *        + Ví dụ: basePrice=25k, discount=15% → 25k * 1.05 * 0.85 = 22,312.5
 *
 *    - calculateInventoryValue():
 *        + Tính tổng giá trị hàng tồn kho (không giảm giá)
 *        + Công thức: calculateFinalPrice(0) * stockQuantity
 *
 *    - needsRestock():
 *        + Thực phẩm cần nhập hàng khi tồn kho < 50
 *        + Return: stockQuantity < 50
 *
 *    - updateStock(quantity):
 *        + quantity > 0: nhập thêm hàng
 *        + quantity < 0: bán hàng
 *        + Kiểm tra: nếu bán mà không đủ hàng thì return false
 *        + Nếu hợp lệ: cập nhật stockQuantity và return true
 *
 * 4. Override toString():
 *    Format (5 dòng):
 *    [THỰC PHẨM] Mã SP: [productId]
 *    Tên: [name]
 *    Giá gốc: [basePrice] VNĐ
 *    Tồn kho: [stockQuantity]
 *    Hạn sử dụng: [shelfLifeDays] ngày
 */
class FoodProduct implements Product {
    // TODO: Khai báo thuộc tính

    // TODO: Constructor

    // TODO: Implement các phương thức từ interface

    // TODO: Override toString()
}
