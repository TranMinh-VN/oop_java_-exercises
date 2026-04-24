package part1_java_core.company;


public class Company {
    private final String companyName;
    private final Employee[] employees;
    private int employeeCount;

    public Company(String companyName, int maxEmployees) {
        this.companyName = companyName;
        this.employees = new Employee[maxEmployees];
        this.employeeCount = 0;
    }
    // Nếu mảng employees đã đầy thì in ra màn hình: Cannot add more employees. The company is full.
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("Cannot add more employees. The company is full.");
        }
    }

    /**
     * Tính tổng lương của tất cả nhân viên trong công ty.
     * Hành động:
     * - Khởi tạo một biến 'total' bằng 0.
     * - Dùng vòng lặp để duyệt qua tất cả nhân viên hiện có.
     * - Với mỗi nhân viên, gọi phương thức calculateSalary() của họ và cộng vào 'total'.
     *   (Đây chính là tính đa hình: Java sẽ tự động gọi đúng phương thức
     *   calculateSalary() của Manager hoặc Developer).
     * @return Tổng lương của tất cả nhân viên.
     */
    public double getTotalPayroll() {
        return -1;
    }

    /**
     * Tìm nhân viên có lương cao nhất.
     * Hành động:
     * - Nếu không có nhân viên nào, trả về null.
     * - Giả sử nhân viên đầu tiên (tại chỉ số 0) có lương cao nhất.
     * - Dùng vòng lặp duyệt từ nhân viên thứ hai (chỉ số 1).
     * - So sánh lương của nhân viên hiện tại với lương của nhân viên đang có lương cao nhất.
     * - Nếu lương của nhân viên hiện tại cao hơn, cập nhật lại nhân viên có lương cao nhất.
     * @return Đối tượng Employee có lương cao nhất, hoặc null nếu không có nhân viên.
     */
    public Employee findHighestPaidEmployee() {
        return null;
    }

    /**
     * In báo cáo công việc của tất cả nhân viên.
     * Hành động:
     * - In ra tiêu đề báo cáo.
     * - Dùng vòng lặp duyệt qua tất cả nhân viên.
     * - Với mỗi nhân viên, gọi phương thức getWorkReport() và in kết quả ra.
     *   (Tính đa hình lại được áp dụng ở đây).
     */
    public void generateWorkReports() {
        System.out.println("\n--- Work Reports for " + companyName + " ---");
        //............
        System.out.println("------------------------------------");
    }

    // Phương thức này cung cấp sẵn để hiển thị danh sách nhân viên
    public void displayAllEmployees() {
        System.out.println("\n--- Employee List for " + companyName + " ---");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i]); // Tự động gọi toString()
        }
        System.out.println("------------------------------------");
    }
}
