package part4_tinh_ke_thua.student;
/**
 * Class ScholarshipStudent - Sinh viên học bổng
 *
 * MÔ TẢ:
 * - ScholarshipStudent là một loại Student
 * - Có 5 thuộc tính:
 *   + studentId (String): Mã sinh viên
 *   + name (String): Tên sinh viên
 *   + gpa (double): Điểm trung bình (0-10)
 *   + credits (int): Số tín chỉ đã hoàn thành
 *   + scholarshipAmount (double): Số tiền học bổng
 *
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Implement các phương thức:
 *    - getStudentId(), getName(), getGPA(), getCredits(): return thuộc tính
 *    - calculateTuition():
 *        + Học phí gốc = credits * 200000
 *        + Học phí thực = học phí gốc - scholarshipAmount
 *        + Nếu học phí thực < 0 thì return 0
 *    - canGraduate(): Đủ điều kiện nếu credits >= 120 VÀ gpa >= 2.0
 *    - getAcademicRank(): Giống RegularStudent
 * 4. Override toString():
 *    [SINH VIÊN HỌC BỔNG] Mã SV: [studentId]
 *    Tên: [name]
 *    GPA: [gpa]
 *    Tín chỉ: [credits]
 *    Học bổng: [scholarshipAmount] VNĐ
 */

class ScholarshipStudent implements Student {
    // TODO: Khai báo thuộc tính

    // TODO: Constructor

    // TODO: Implement các phương thức

    // TODO: Override toString()
}
