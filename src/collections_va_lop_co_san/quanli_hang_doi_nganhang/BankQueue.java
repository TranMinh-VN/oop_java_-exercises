package collections_va_lop_co_san.quanli_hang_doi_nganhang;

/**
 * Class BankQueue - Quản lý hàng đợi ngân hàng
 *
 * Mô tả:
 * - Class này quản lý hàng đợi khách hàng trong ngân hàng
 * - Cần implements interface IBankQueue
 * - Sử dụng PriorityQueue để tự động sắp xếp khách hàng theo độ ưu tiên
 *
 * Thuộc tính:
 * - queue: Queue<ICustomer> - Hàng đợi khách hàng (sử dụng PriorityQueue)
 *
 * Yêu cầu:
 * 1. Tạo constructor khởi tạo PriorityQueue rỗng
 * 2. Implement các methods:
 *    - addCustomer(): Thêm khách hàng vào hàng đợi, return true nếu thành công
 *    - serveNext(): Lấy ra và xóa khách hàng tiếp theo (return null nếu queue rỗng)
 *    - peek(): Xem khách hàng tiếp theo mà không xóa (return null nếu queue rỗng)
 *    - isEmpty(): Kiểm tra hàng đợi có rỗng không
 *    - getQueueSize(): Trả về số lượng khách hàng trong hàng đợi
 *    - getAllCustomers(): Trả về List tất cả khách hàng (không thay đổi queue)
 *    - getCustomerPosition(): Trả về vị trí của khách hàng (1-based, -1 nếu không tìm thấy)
 *    - getCustomersByService(): Trả về List khách hàng theo loại dịch vụ
 * 3. Override toString() để in danh sách khách hàng theo thứ tự ưu tiên
 */
class BankQueue implements IBankQueue {
    // TODO: Khai báo thuộc tính

    // TODO: Tạo constructor

    // TODO: Implement các methods từ interface

    // TODO: Override toString()
}
