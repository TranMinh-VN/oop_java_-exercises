package part6_collections_va_lop_co_san.quanli_kho;

/**
 * Class Inventory - Quản lý kho sản phẩm
 *
 * Mô tả:
 * - Class này quản lý kho sản phẩm sử dụng Map
 * - Cần implements interface IInventory
 * - Sử dụng HashMap với key là productId, value là IProduct
 *
 * Thuộc tính:
 * - products: Map<String, IProduct> - Map lưu trữ sản phẩm (sử dụng HashMap)
 *
 * Yêu cầu:
 * 1. Tạo constructor khởi tạo HashMap rỗng
 * 2. Implement các methods:
 *    - addProduct(): Thêm sản phẩm, return false nếu productId đã tồn tại
 *    - removeProduct(): Xóa sản phẩm theo ID, return true nếu xóa thành công
 *    - getProduct(): Lấy sản phẩm theo ID (return null nếu không tìm thấy)
 *    - updateQuantity(): Cập nhật số lượng, return true nếu thành công
 *    - updatePrice(): Cập nhật giá, return true nếu thành công
 *    - getAllProducts(): Trả về Map tất cả sản phẩm
 *    - getProductsByCategory(): Trả về List sản phẩm theo danh mục
 *    - getAllCategories(): Trả về Set các danh mục (không trùng lặp)
 *    - getTotalProducts(): Trả về tổng số sản phẩm
 *    - getTotalInventoryValue(): Trả về tổng giá trị kho (price * quantity)
 *    - getLowStockProducts(): Trả về sản phẩm có quantity <= threshold
 *    - getMostExpensiveProduct(): Trả về sản phẩm có giá cao nhất
 * 3. Override toString() để in danh sách sản phẩm
 */
class Inventory implements IInventory {
    // TODO: Khai báo thuộc tính

    // TODO: Tạo constructor

    // TODO: Implement các methods từ interface

    // TODO: Override toString()
}
