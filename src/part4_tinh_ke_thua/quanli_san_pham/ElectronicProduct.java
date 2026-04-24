package part4_tinh_ke_thua.quanli_san_pham;

/**
 * Class ElectronicProduct - Đại diện cho sản phẩm điện tử
 *
 * MÔ TẢ:
 * - ElectronicProduct là một loại Product
 * - Có 5 thuộc tính:
 *   + productId (String): Mã sản phẩm
 *   + name (String): Tên sản phẩm
 *   + basePrice (double): Giá gốc
 *   + stockQuantity (int): Số lượng tồn kho
 *   + warrantyMonths (int): Số tháng bảo hành
 *
 * YÊU CẦU:
 * 1. Khai báo các thuộc tính với kiểu dữ liệu phù hợp
 * 2. Tạo constructor nhận 5 tham số
 * 3. Implement các phương thức:
 *    - getProductId(), getName(), getBasePrice(), getStockQuantity(): return thuộc tính tương ứng
 *
 *    - calculateFinalPrice(discountPercent):
 *        + Sản phẩm điện tử có thuế VAT 8%
 *        + Công thức: basePrice * (1 + 0.08) * (1 - discountPercent/100)
 *        + Ví dụ: basePrice=25tr, discount=10% → 25tr * 1.08 * 0.9 = 24.3tr
 *
 *    - calculateInventoryValue():
 *        + Tính tổng giá trị hàng tồn kho (không giảm giá)
 *        + Công thức: calculateFinalPrice(0) * stockQuantity
 *
 *    - needsRestock():
 *        + Sản phẩm điện tử cần nhập hàng khi tồn kho < 10
 *        + Return: stockQuantity < 10
 *
 *    - updateStock(quantity):
 *        + quantity > 0: nhập thêm hàng
 *        + quantity < 0: bán hàng
 *        + Kiểm tra: nếu bán mà không đủ hàng thì return false
 *        + Nếu hợp lệ: cập nhật stockQuantity và return true
 *
 * 4. Override toString():
 *    Format (5 dòng):
 *    [ĐIỆN TỬ] Mã SP: [productId]
 *    Tên: [name]
 *    Giá gốc: [basePrice] VNĐ
 *    Tồn kho: [stockQuantity]
 *    Bảo hành: [warrantyMonths] tháng
 */
class ElectronicProduct implements Product {
    // TODO: Khai báo thuộc tính

    // TODO: Constructor

    // TODO: Implement các phương thức từ interface

    // TODO: Override toString()
}

