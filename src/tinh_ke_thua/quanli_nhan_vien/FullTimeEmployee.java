package tinh_ke_thua.quanli_nhan_vien;

/**
 * Class FullTimeEmployee - Đại diện cho nhân viên toàn thời gian
 *
 * MÔ TẢ:
 * - FullTimeEmployee là một loại Employee (nhân viên)
 * - Có 4 thuộc tính:
 *   + employeeId (String): Mã nhân viên
 *   + name (String): Tên nhân viên
 *   + workDays (int): Số ngày làm việc trong tháng
 *   + baseSalary (double): Lương cơ bản tháng
 *
 * YÊU CẦU:
 * 1. Khai báo các thuộc tính với kiểu dữ liệu phù hợp
 * 2. Tạo constructor nhận 4 tham số để khởi tạo đối tượng
 * 3. Implement tất cả phương thức từ interface Employee:
 *    - getEmployeeId(): trả về mã nhân viên
 *    - getName(): trả về tên nhân viên
 *    - getWorkDays(): trả về số ngày làm việc
 *    - calculateSalary():
 *        + Nhân viên full-time có lương cố định
 *        + Công thức: return baseSalary
 *    - calculateBonus(performanceScore):
 *        + Công thức: baseSalary * (performanceScore / 100) * 0.2
 *        + performanceScore: điểm hiệu suất (0-100)
 *        + 0.2: hệ số thưởng 20% cho nhân viên full-time
 * 4. Override phương thức toString():
 *    - Format (4 dòng):
 *      [FULL-TIME] Mã NV: [employeeId]
 *      Tên: [name]
 *      Số ngày làm việc: [workDays]
 *      Lương cơ bản: [baseSalary] VNĐ
 */
class FullTimeEmployee implements Employee {
    // TODO: Khai báo thuộc tính với kiểu dữ liệu rõ ràng

    // TODO: Tạo constructor

    // TODO: Implement các phương thức từ interface

    // TODO: Override phương thức toString()
}

