package part7_solid.bank_account;

/**
 * CLASS 2: Transaction - Đại diện cho một giao dịch
 *
 * THUỘC TÍNH:
 * - transactionId: String - Mã giao dịch (duy nhất)
 * - transactionType: String - Loại giao dịch (DEPOSIT, WITHDRAW, TRANSFER, INTEREST)
 * - amount: double - Số tiền giao dịch
 * - fromAccount: String - Tài khoản nguồn
 * - toAccount: String - Tài khoản đích
 * - description: String - Mô tả giao dịch
 * - status: String - Trạng thái (SUCCESS, FAILED, PENDING)
 *
 * YÊU CẦU:
 * 1. Implement các interface: Displayable, Validatable
 * 2. Constructor nhận các tham số: transactionId, transactionType, amount, fromAccount, toAccount, description
 *    - status = "SUCCESS"
 * 3. Implement phương thức getDisplayInfo():
 *    - Format: "Transaction [transactionId] | Type: [transactionType] | Amount: [amount] VND | From: [fromAccount] | To: [toAccount] | Status: [status] | Description: [description]"
 * 4. Implement phương thức isValid():
 *    - transactionId không null và không rỗng
 *    - transactionType là một trong: DEPOSIT, WITHDRAW, TRANSFER, INTEREST
 *    - amount > 0
 *    - fromAccount không null và không rỗng
 *    - toAccount không null và không rỗng
 *    - status là một trong: SUCCESS, FAILED, PENDING
 * 5. Phương thức setStatus(String status): set status mới
 * 6. Override toString() trả về getDisplayInfo()
 * 7. Tạo các getter cho tất cả thuộc tính
 */
public class Transaction implements Displayable, Validatable {
    // TODO: Sinh viên hoàn thiện class này

}
