package part7_solid.bank_account;

/**
 * CLASS 1: BankAccount - Đại diện cho một tài khoản ngân hàng
 *
 * THUỘC TÍNH:
 * - accountNumber: String - Số tài khoản (duy nhất, 10 chữ số)
 * - accountHolder: String - Tên chủ tài khoản
 * - balance: double - Số dư tài khoản (>= 0)
 * - accountType: String - Loại tài khoản (SAVINGS, CHECKING, BUSINESS)
 * - interestRate: double - Lãi suất (%/năm)
 * - isLocked: boolean - Trạng thái khóa tài khoản
 * - transactions: java.util.List<Transaction> - Danh sách giao dịch
 * - minimumBalance: double - Số dư tối thiểu (mặc định 50000)
 * - private int count = 0 - biến để generate ID cho transaction
 *
 * YÊU CẦU:
 * 1. Implement các interface: Transactable, Displayable, Validatable, Lockable
 * 2. Constructor nhận các tham số: accountNumber, accountHolder, accountType, initialBalance
 *    - balance = initialBalance
 *    - isLocked = false
 *    - transactions = new ArrayList
 *    - minimumBalance = 50000
 *    - interestRate phụ thuộc accountType:
 *      + SAVINGS: 5.0%
 *      + CHECKING: 0.5%
 *      + BUSINESS: 2.0%
 * 3. Implement phương thức deposit(double amount):
 *    - Kiểm tra isLocked == true thì throw AccountLockedException
 *    - Kiểm tra amount > 0, nếu không throw InvalidTransactionException
 *    - Cộng amount vào balance
 *    - Tạo Transaction mới với type = "DEPOSIT" và thêm vào transactions
 * 4. Implement phương thức withdraw(double amount):
 *    - Kiểm tra isLocked == true thì throw AccountLockedException
 *    - Kiểm tra amount > 0, nếu không throw InvalidTransactionException
 *    - Kiểm tra balance - amount >= minimumBalance, nếu không throw InsufficientBalanceException
 *    - Trừ amount từ balance
 *    - Tạo Transaction mới với type = "WITHDRAW" và thêm vào transactions
 * 5. Implement phương thức getBalance(): trả về balance
 * 6. Phương thức transfer(BankAccount targetAccount, double amount):
 *    - Rút tiền từ tài khoản hiện tại
 *    - Gửi tiền vào targetAccount
 *    - Tạo Transaction với type = "TRANSFER" cho cả 2 tài khoản
 * 7. Phương thức calculateInterest():
 *    - Tính lãi: balance * interestRate / 100
 *    - Trả về số tiền lãi
 * 8. Phương thức applyInterest():
 *    - Cộng lãi vào balance
 *    - Tạo Transaction với type = "INTEREST"
 * 9. Implement phương thức getDisplayInfo():
 *    - Format: "Account: [accountNumber] | Holder: [accountHolder] | Type: [accountType] | Balance: [balance] VND | Interest Rate: [interestRate]% | Status: [Active/Locked]"
 * 10. Implement phương thức isValid():
 *     - accountNumber có độ dài 10 và chỉ chứa số
 *     - accountHolder không null và không rỗng
 *     - balance >= 0
 *     - accountType là một trong: SAVINGS, CHECKING, BUSINESS
 * 11. Implement lock(): set isLocked = true
 * 12. Implement unlock(): set isLocked = false
 * 13. Implement isLocked(): trả về isLocked
 * 14. Phương thức getTransactionHistory(): trả về danh sách transactions
 * 15. Override toString() trả về getDisplayInfo()
 * 16. Tạo các getter cho tất cả thuộc tính
 */
public class BankAccount implements Transactable, Displayable, Validatable, Lockable {
    // TODO: Sinh viên hoàn thiện class này
    private int count = 0;

    private String generateTransactionId() {
        // Simple ID generation for demonstration
        count++;
        return "TXN" + count;
    }
}
