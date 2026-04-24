package part4_tinh_ke_thua.student;

import java.util.*;
class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    /**
     * TODO: Tìm sinh viên theo ID
     * Thuật toán: Tìm kiếm tuyến tính (Linear Search)
     * - Duyệt qua từng sinh viên trong danh sách
     * - So sánh studentId
     * - Return sinh viên nếu tìm thấy, null nếu không tìm thấy
     * Độ phức tạp: O(n)
     */
    public Student findStudentById(String studentId) {
        // TODO: Implement thuật toán tìm kiếm
        return null;
    }

    /**
     * TODO: Tìm sinh viên theo tên (tìm gần đúng)
     * Thuật toán: Tìm kiếm tuyến tính với so sánh chuỗi
     * - Duyệt qua từng sinh viên
     * - Chuyển tên về lowercase để so sánh không phân biệt hoa thường
     * - Dùng contains() để tìm chuỗi con
     * - Thêm vào list kết quả nếu khớp
     * Độ phức tạp: O(n)
     */
    public List<Student> searchStudentsByName(String keyword) {
        // TODO: Implement thuật toán tìm kiếm
        return new ArrayList<>();
    }

    /**
     * TODO: Lọc sinh viên đủ điều kiện tốt nghiệp
     * Thuật toán: Filter (Lọc dữ liệu)
     * - Duyệt qua từng sinh viên
     * - Gọi canGraduate() để kiểm tra
     * - Thêm vào list kết quả nếu đủ điều kiện
     * Độ phức tạp: O(n)
     */
    public List<Student> getStudentsCanGraduate() {
        // TODO: Implement thuật toán lọc
        return new ArrayList<>();
    }

    /**
     * TODO: Lấy top N sinh viên có GPA cao nhất
     * Thuật toán:
     * 1. Sắp xếp danh sách theo GPA giảm dần (dùng sortByGPA)
     * 2. Lấy N phần tử đầu tiên
     * Độ phức tạp: O(n²) do sắp xếp
     */
    public List<Student> getTopStudents(int n) {
        // TODO: Implement thuật toán
        return new ArrayList<>();
    }

    /**
     * TODO: Sắp xếp sinh viên theo GPA
     * Thuật toán: Bubble Sort (Sắp xếp nổi bọt)
     *
     * Các bước:
     * 1. Tạo bản copy của danh sách (để không thay đổi list gốc)
     * 2. Dùng 2 vòng lặp lồng nhau:
     *    - Vòng ngoài: i từ 0 đến n-1
     *    - Vòng trong: j từ 0 đến n-i-1
     * 3. So sánh GPA của phần tử j và j+1
     * 4. Hoán đổi nếu:
     *    - ascending = true: gpa[j] > gpa[j+1]
     *    - ascending = false: gpa[j] < gpa[j+1]
     *
     * Độ phức tạp: O(n²)
     *
     * @param ascending true = tăng dần, false = giảm dần
     * @return Danh sách đã sắp xếp
     */
    public List<Student> sortByGPA(boolean ascending) {
        // TODO: Implement Bubble Sort
        // Gợi ý:
        // List<Student> sorted = new ArrayList<>(students);
        // int n = sorted.size();
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         // So sánh và hoán đổi
        //     }
        // }
        return new ArrayList<>();
    }

    /**
     * TODO: Sắp xếp sinh viên theo tên (A-Z)
     * Thuật toán: Bubble Sort với compareTo()
     *
     * Các bước:
     * 1. Tạo bản copy của danh sách
     * 2. Dùng 2 vòng lặp lồng nhau (giống sortByGPA)
     * 3. So sánh tên bằng compareTo():
     *    - name1.compareTo(name2) > 0: name1 lớn hơn (sau) name2
     *    - name1.compareTo(name2) < 0: name1 nhỏ hơn (trước) name2
     *    - name1.compareTo(name2) = 0: hai tên bằng nhau
     * 4. Hoán đổi nếu name[j] > name[j+1]
     *
     * Độ phức tạp: O(n²)
     */
    public List<Student> sortByName() {
        // TODO: Implement Bubble Sort cho tên
        return new ArrayList<>();
    }

    /**
     * TODO: Tính GPA trung bình của tất cả sinh viên
     * Thuật toán: Tính trung bình cộng
     *
     * Các bước:
     * 1. Khởi tạo biến sum = 0
     * 2. Duyệt qua từng sinh viên, cộng GPA vào sum
     * 3. Trả về sum / số lượng sinh viên
     * 4. Xử lý trường hợp danh sách rỗng (return 0)
     *
     * Độ phức tạp: O(n)
     */
    public double calculateAverageGPA() {
        // TODO: Implement thuật toán tính trung bình
        return 0.0;
    }

    /**
     * TODO: Tính tổng học phí của tất cả sinh viên
     * Thuật toán: Tính tổng
     *
     * Các bước:
     * 1. Khởi tạo biến total = 0
     * 2. Duyệt qua từng sinh viên
     * 3. Gọi calculateTuition() và cộng vào total
     * 4. Trả về total
     *
     * Độ phức tạp: O(n)
     */
    public double calculateTotalTuition() {
        // TODO: Implement thuật toán tính tổng
        return 0.0;
    }
}
