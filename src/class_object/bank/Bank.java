package class_object.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp Bank quản lý một danh sách các tài khoản ngân hàng.
 * Lớp này thể hiện sự tương tác giữa các đối tượng trong một hệ thống.
 */
public class Bank {
    /**
     * Danh sách chứa tất cả các tài khoản trong ngân hàng.
     */
    private List<Account> accounts;

    /**
     * Hàm khởi tạo cho lớp Bank.
     */
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    /**
     * Thêm một tài khoản mới vào ngân hàng.
     */
    public void addAccount(Account account) {
        this.accounts.add(account);
        System.out.println("Đã thêm tài khoản mới: " + account.getAccountNumber());
    }

    /**
     * [BÀI TẬP] Hiển thị thông tin chi tiết của tất cả các tài khoản trong ngân hàng.
     * Yêu cầu:
     * 1. In ra một tiêu đề, ví dụ: "\n===== DANH SÁCH TẤT CẢ TÀI KHOẢN =====".
     * 2. Kiểm tra xem danh sách `accounts` có rỗng không.
     *    - Nếu rỗng, in ra thông báo: "Ngân hàng chưa có tài khoản nào."
     *    - Nếu không rỗng, duyệt qua từng đối tượng `Account` trong danh sách `accounts`.
     *      Với mỗi tài khoản, gọi phương thức `displayDetails()` của nó.
     *      (Đây là nơi tính đa hình được thể hiện, vì `displayDetails()` của SavingsAccount
     *      và CurrentAccount sẽ được tự động gọi tương ứng).
     * 3. In ra một dòng kết thúc, ví dụ: "=======================================".
     */
    public void displayAllAccounts() {
        // TODO: Học viên cần hoàn thiện phương thức này.
        // Xóa dòng này và viết mã của bạn vào đây.
        System.out.println("Phương thức displayAllAccounts() chưa được triển khai.");
    }

    /**
     * [BÀI TẬP] Tìm kiếm một tài khoản trong ngân hàng dựa trên số tài khoản.
     * Yêu cầu:
     * 1. Duyệt qua danh sách `accounts`.
     * 2. Với mỗi tài khoản, so sánh `accountNumber` của nó (lấy bằng `getAccountNumber()`)
     *    với tham số `accountNumber` được truyền vào.
     * 3. Nếu tìm thấy tài khoản trùng khớp, trả về (return) đối tượng tài khoản đó.
     * 4. Nếu duyệt hết danh sách mà không tìm thấy, trả về `null`.
     *
     * @param accountNumber Số tài khoản cần tìm.
     * @return Đối tượng `Account` nếu tìm thấy, ngược lại trả về `null`.
     */
    public Account findAccount(String accountNumber) {
        // TODO: Học viên cần hoàn thiện phương thức này.
        // Xóa dòng này và viết mã của bạn vào đây.
        System.out.println("Phương thức findAccount() chưa được triển khai.");
        return null;
    }
}
