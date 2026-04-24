package part6_collections_va_lop_co_san.quanli_hocsinh;

/**
 * Class StudentManager - Quản lý danh sách sinh viên
 *
 * Mô tả:
 * - Class này quản lý danh sách sinh viên trong trường
 * - Cần implements interface IStudentManager
 * - Sử dụng HashSet để lưu trữ sinh viên (không cho phép trùng lặp ID)
 *
 * Thuộc tính:
 * - students: Set<IStudent> - Danh sách sinh viên (sử dụng HashSet)
 *
 * Yêu cầu:
 * 1. Tạo constructor khởi tạo HashSet rỗng
 * 2. Implement các methods:
 *    - addStudent(): Thêm sinh viên, return true nếu thành công, false nếu ID đã tồn tại
 *    - removeStudent(): Xóa sinh viên theo ID, return true nếu xóa được
 *    - findStudentById(): Tìm sinh viên theo ID (return null nếu không tìm thấy)
 *    - findStudentsByMajor(): Tìm tất cả sinh viên của một ngành
 *    - getAllStudents(): Trả về Set tất cả sinh viên
 *    - getTotalStudents(): Trả về tổng số sinh viên
 *    - getTopStudents(): Trả về sinh viên có GPA >= minGPA
 *    - getAllMajors(): Trả về Set các ngành học (không trùng lặp)
 *    - hasStudent(): Kiểm tra sinh viên có tồn tại không
 * 3. Override toString() để in danh sách sinh viên
 */
class StudentManager implements IStudentManager {
    // TODO: Khai báo thuộc tính

    // TODO: Tạo constructor

    // TODO: Implement các methods từ interface

    // TODO: Override toString()
}
