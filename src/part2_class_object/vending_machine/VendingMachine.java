package part2_class_object.vending_machine;

/**
 * Lớp VendingMachine chứa toàn bộ logic hoạt động của một máy bán hàng tự động.
 * Lớp này quản lý trạng thái hiện tại của máy (số dư, sản phẩm đã chọn),
 * xử lý các giao dịch mua bán, và tương tác với kho hàng (Inventory).
 * Nó được thiết kế để mô phỏng các hoạt động chính như chọn hàng, bỏ tiền,
 * thực hiện giao dịch và hủy bỏ.
 */
public class VendingMachine {
    private Inventory<Item> itemInventory = new Inventory<>();
    private Inventory<Coin> cashInventory = new Inventory<>();
    private long currentBalance = 0;
    private Item selectedItem = null;

    /**
     * Hàm khởi tạo cho VendingMachine.
     * Tự động gọi phương thức initialize() để nạp sản phẩm và tiền vào máy.
     */
    public VendingMachine() {
        initialize();
    }

    /**
     * Phương thức private để thiết lập trạng thái ban đầu cho máy bán hàng.
     * Nạp một số lượng sản phẩm và tiền mặt mặc định vào kho.
     */
    private void initialize() {
        for (Item item : ProductCatalog.getAllItems()) {
            itemInventory.put(item, 5); // Mỗi sản phẩm có 5 món
        }
        // Có thể thêm logic nạp tiền ban đầu vào cashInventory nếu cần
    }

    /**
     * Hiển thị danh sách tất cả các sản phẩm có sẵn trong máy,
     * bao gồm tên, giá và số lượng tồn kho hiện tại.
     */
    public void displayProducts() {
        System.out.println("\n===== SẢN PHẨM HIỆN CÓ =====");
        for (Item item : ProductCatalog.getAllItems()) {
            System.out.printf("- %s: %,d VND (Còn lại: %d)\n",
                    item.getName(), item.getPrice(), itemInventory.getQuantity(item));
        }
        System.out.println("=============================");
    }

    /**
     * [BÀI TẬP] Hoàn thiện hàm này.
     *
     * Yêu cầu:
     * 1. Kiểm tra xem sản phẩm (`item`) được chọn có còn hàng trong kho (`itemInventory`) hay không.
     * Sử dụng phương thức `hasItem()` của lớp Inventory.
     * 2. Nếu sản phẩm còn hàng:
     * - Gán sản phẩm đó cho biến `selectedItem` của lớp VendingMachine.
     * - In ra thông báo cho người dùng biết họ đã chọn sản phẩm nào và giá của nó.
     * 3. Nếu sản phẩm đã hết hàng:
     * - Ném ra một ngoại lệ `VendingMachineExceptions.SoldOutException` với thông báo phù hợp
     * (ví dụ: "Xin lỗi, [Tên sản phẩm] đã hết hàng.").
     *
     * @param item Đối tượng Item mà người dùng muốn chọn.
     * @throws VendingMachineExceptions.SoldOutException nếu sản phẩm đã hết hàng.
     */
    public void selectItem(Item item) throws VendingMachineExceptions.SoldOutException {
        // TODO: Học sinh cần viết code ở đây
    }


    /**
     * Xử lý việc người dùng bỏ tiền vào máy.
     * Phương thức sẽ kiểm tra tính hợp lệ của mệnh giá tiền và cập nhật số dư hiện tại.
     *
     * @param value Mệnh giá tiền (dạng long) mà người dùng bỏ vào.
     * @throws VendingMachineExceptions.InvalidCoinException nếu mệnh giá không được máy chấp nhận.
     */
    public void insertCoin(long value) throws VendingMachineExceptions.InvalidCoinException {
        if (!Coin.isValid(value)) {
            throw new VendingMachineExceptions.InvalidCoinException("Mệnh giá " + value + " không được chấp nhận.");
        }
        currentBalance += value;
        cashInventory.add(new Coin(value));
        System.out.println("Đã bỏ vào: " + value + ". Số dư hiện tại: " + currentBalance);
    }

    /**
     * [BÀI TẬP] Hoàn thiện hàm này.
     *
     * Yêu cầu:
     * 1. Kiểm tra xem người dùng đã chọn sản phẩm nào chưa (biến `selectedItem` có null không).
     * Nếu chưa, hãy in thông báo và trả về 0.
     * 2. So sánh số dư hiện tại (`currentBalance`) với giá của sản phẩm đã chọn (`selectedItem.getPrice()`).
     * 3. Nếu số dư đủ để mua (`currentBalance >= price`):
     * a. Giảm số lượng của sản phẩm đó trong kho `itemInventory` đi 1.
     * b. Tính toán số tiền thối: `change = currentBalance - price`.
     * c. In thông báo giao dịch thành công và số tiền thối.
     * d. Gọi hàm `resetTransaction()` để đặt lại trạng thái máy.
     * e. Trả về số tiền thối `change`.
     * 4. Nếu số dư không đủ:
     * a. Tính số tiền còn thiếu.
     * b. Ném ra một ngoại lệ `VendingMachineExceptions.NotEnoughMoneyException` với thông báo
     * chỉ rõ số tiền còn thiếu.
     *
     * @return Số tiền thối trả lại cho khách hàng.
     * @throws VendingMachineExceptions.NotEnoughMoneyException nếu số dư không đủ để mua.
     */
    public long executeTransaction() throws VendingMachineExceptions.NotEnoughMoneyException {
        // TODO: Học sinh cần viết code ở đây
        return 0; // Dòng code tạm thời
    }


    /**
     * Hủy bỏ giao dịch hiện tại.
     * Máy sẽ trả lại toàn bộ số tiền mà người dùng đã bỏ vào và đặt lại trạng thái giao dịch.
     *
     * @return Toàn bộ số tiền được hoàn lại cho người dùng.
     */
    public long cancelTransaction() {
        System.out.println("Giao dịch đã được hủy. Vui lòng nhận lại tiền.");
        long refund = currentBalance;
        resetTransaction();
        return refund;
    }

    /**
     * Phương thức private để đặt lại trạng thái của máy sau khi một giao dịch
     * kết thúc (dù thành công hay bị hủy).
     * Xóa sản phẩm đã chọn và đặt lại số dư về 0.
     */
    private void resetTransaction() {
        currentBalance = 0;
        selectedItem = null;
    }
}
