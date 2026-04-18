package solid.quanli_thuvien;

/**
 * CLASS 2: LibraryMember - Đại diện cho thành viên thư viện
 *
 * THUỘC TÍNH:
 * - memberId: String - ID thành viên (duy nhất)
 * - name: String - Tên thành viên
 * - email: String - Email thành viên
 * - phoneNumber: String - Số điện thoại
 * - borrowedBooks: int - Số sách đang mượn
 * - maxBorrowLimit: int - Số sách tối đa được mượn (mặc định 5)
 *
 * YÊU CẦU:
 * 1. Implement các interface: Displayable, Validatable
 * 2. Constructor nhận các tham số: memberId, name, email, phoneNumber
 *    - borrowedBooks mặc định = 0
 *    - maxBorrowLimit mặc định = 5
 * 3. Implement phương thức getDisplayInfo():
 *    - Format: "Member ID: [id] | Name: [name] | Email: [email] | Phone: [phone] | Borrowed: [borrowedBooks]/[maxBorrowLimit]"
 * 4. Implement phương thức isValid():
 *    - Kiểm tra memberId không null và không rỗng
 *    - Kiểm tra name không null và không rỗng
 *    - Kiểm tra email chứa ký tự '@'
 *    - Kiểm tra phoneNumber không null và có độ dài >= 10
 * 5. Phương thức canBorrowMore(): trả về true nếu borrowedBooks < maxBorrowLimit
 * 6. Phương thức incrementBorrowCount(): tăng borrowedBooks lên 1
 * 7. Phương thức decrementBorrowCount(): giảm borrowedBooks xuống 1 (không được < 0)
 * 8. Override toString() trả về getDisplayInfo()
 * 9. Tạo các getter cho tất cả thuộc tính
 */
class LibraryMember implements Displayable, Validatable {
    // TODO: Sinh viên hoàn thiện class này

}

