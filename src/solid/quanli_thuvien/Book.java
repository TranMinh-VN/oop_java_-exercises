package solid.quanli_thuvien;

/**
 * CLASS 1: Book - Đại diện cho một cuốn sách
 *
 * THUỘC TÍNH:
 * - isbn: String - Mã ISBN của sách (duy nhất)
 * - title: String - Tên sách
 * - author: String - Tác giả
 * - publicationYear: int - Năm xuất bản
 * - isBorrowed: boolean - Trạng thái đã mượn hay chưa
 * - borrowedBy: String - ID của thành viên đang mượn (null nếu chưa mượn)
 *
 * YÊU CẦU:
 * 1. Implement các interface: Borrowable, Displayable, Validatable
 * 2. Constructor nhận đầy đủ tham số (trừ isBorrowed và borrowedBy - mặc định false và null)
 * 3. Implement phương thức borrow():
 *    - Kiểm tra nếu đã mượn thì throw BookAlreadyBorrowedException
 *    - Nếu chưa mượn thì đánh dấu isBorrowed = true và lưu borrowedBy
 * 4. Implement phương thức returnItem():
 *    - Đặt isBorrowed = false và borrowedBy = null
 * 5. Implement phương thức isBorrowed(): trả về trạng thái mượn
 * 6. Implement phương thức getDisplayInfo():
 *    - Trả về chuỗi với format: "ISBN: [isbn] | Title: [title] | Author: [author] | Year: [year] | Status: [Available/Borrowed by memberID]"
 * 7. Implement phương thức isValid():
 *    - Kiểm tra isbn không null và không rỗng
 *    - Kiểm tra title không null và không rỗng
 *    - Kiểm tra author không null và không rỗng
 *    - Kiểm tra publicationYear > 0 và <= năm hiện tại
 * 8. Override toString() trả về getDisplayInfo()
 * 9. Tạo các getter cho tất cả thuộc tính
 */
class Book implements Borrowable, Displayable, Validatable {
    // TODO: Sinh viên hoàn thiện class này

}
