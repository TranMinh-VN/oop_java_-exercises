package collections_va_lop_co_san.quanli_hang_doi_nganhang;

/**
 * Class Customer - Đại diện cho một khách hàng
 *
 * Mô tả:
 * - Class này đại diện cho một khách hàng trong hàng đợi ngân hàng
 * - Cần implements interface ICustomer
 * - Implements Comparable để sắp xếp theo priority (priority cao hơn được phục vụ trước)
 *
 * Thuộc tính:
 * - ticketNumber: String - Số thứ tự (ví dụ: "A001", "B002")
 * - name: String - Tên khách hàng
 * - serviceType: String - Loại dịch vụ (ví dụ: "Deposit", "Withdraw", "Transfer")
 * - priority: int - Độ ưu tiên (1=thấp, 5=cao, VIP=10)
 *
 * Yêu cầu:
 * 1. Tạo constructor với đầy đủ 4 tham số
 * 2. Implement tất cả methods từ interface ICustomer
 * 3. Implement Comparable<ICustomer> để so sánh theo priority (giảm dần)
 *    Nếu priority bằng nhau thì so sánh theo ticketNumber (tăng dần)
 * 4. Override toString() để in thông tin khách hàng theo format:
 *    "Customer[ticket='<ticket>', name='<name>', service='<service>', priority=<priority>]"
 */
class Customer implements ICustomer, Comparable<ICustomer> {
    // TODO: Khai báo các thuộc tính

    // TODO: Tạo constructor

    // TODO: Implement các methods từ interface

    // TODO: Implement compareTo() từ Comparable

    // TODO: Override toString()
}

