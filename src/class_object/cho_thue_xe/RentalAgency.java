package class_object.cho_thue_xe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Lớp RentalAgency là trung tâm quản lý của hệ thống.
 * Quản lý danh sách xe, khách hàng và các giao dịch thuê/trả.
 */
public class RentalAgency {
    private List<Vehicle> vehicles;
    private List<Customer> customers;
    private List<RentalRecord> rentalRecords;

    public RentalAgency() {
        this.vehicles = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentalRecords = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Xử lý nghiệp vụ cho thuê xe.
     * <p>
     * YÊU CẦU SINH VIÊN HOÀN THIỆN:
     * 1. Tìm đối tượng Customer trong danh sách `customers` dựa vào `customerId`.
     * 2. Tìm đối tượng Vehicle trong danh sách `vehicles` dựa vào `vehicleId`.
     * 3. Kiểm tra các điều kiện sau:
     * - Nếu không tìm thấy khách hàng, in ra thông báo lỗi: "\nLỗi: Không tìm thấy khách hàng với ID [customerId]" và kết thúc hàm.
     * - Nếu không tìm thấy xe, in ra thông báo lỗi: "\nLỗi: Không tìm thấy xe với ID [vehicleId]" và kết thúc hàm.
     * - Nếu xe đã được cho thuê (isAvailable() == false), in ra thông báo lỗi: "\nLỗi: Xe [Hãng] [Model] hiện không có sẵn." và kết thúc hàm.
     * 4. Nếu tất cả điều kiện đều hợp lệ:
     * - Cập nhật trạng thái của xe thành không có sẵn (setAvailable(false)).
     * - Tạo một đối tượng `RentalRecord` mới với thông tin xe và khách hàng vừa tìm được.
     * - Thêm bản ghi vừa tạo vào danh sách `rentalRecords`.
     * - In ra thông báo thành công: "\nThành công: Khách hàng [Tên khách hàng] đã thuê xe [Hãng] [Model].\n"
     *
     * @param customerId ID khách hàng.
     * @param vehicleId  ID xe.
     */
    public void rentVehicle(String customerId, String vehicleId) {
        // TODO: Sinh viên cần hoàn thiện mã nguồn ở đây
    }

    /**
     * Xử lý nghiệp vụ trả xe.
     * <p>
     * YÊU CẦU SINH VIÊN HOÀN THIỆN:
     * 1. Tìm đối tượng Vehicle trong danh sách `vehicles` dựa vào `vehicleId`. Nếu không tìm thấy, in thông báo lỗi và kết thúc.
     * 2. Tìm bản ghi thuê xe (RentalRecord) đang hoạt động cho chiếc xe này. Một bản ghi được coi là đang hoạt động nếu:
     * - ID của xe trong bản ghi trùng với `vehicleId`.
     * - Ngày trả xe (returnDate) của bản ghi đó vẫn là `null`.
     * 3. Nếu không tìm thấy bản ghi đang hoạt động, in ra thông báo lỗi: "\nLỗi: Không tìm thấy giao dịch thuê đang hoạt động cho xe này." và kết thúc hàm.
     * 4. Nếu tìm thấy:
     * - Cập nhật trạng thái của xe thành có sẵn (setAvailable(true)).
     * - Cập nhật ngày trả xe cho bản ghi thuê xe là ngày hiện tại (setReturnDate(LocalDate.now())).
     * - Gọi hàm `calculateTotalCost()` của bản ghi để tính tổng chi phí.
     * - In ra thông báo thành công: "\nThành công: Xe [Hãng] [Model] đã được trả. Tổng chi phí: [Chi phí] VND\n"
     *
     * @param vehicleId ID của xe được trả.
     */
    public void returnVehicle(String vehicleId) {
        // TODO: Sinh viên cần hoàn thiện mã nguồn ở đây
    }

    /**
     * Hiển thị tất cả các xe đang có sẵn.
     * Thể hiện tính Đa hình khi gọi displayDetails().
     */
    public void displayAvailableVehicles() {
        System.out.println("\n===== DANH SÁCH XE CÓ SẴN =====");
        boolean found = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                vehicle.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tất cả xe đã được cho thuê.");
        }
        System.out.println("===============================");
    }

    // Phương thức private hỗ trợ tìm kiếm
    private Customer findCustomerById(String id) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(id)) return c;
        }
        return null;
    }

    private Vehicle findVehicleById(String id) {
        for (Vehicle v : vehicles) {
            if (v.getId().equals(id)) return v;
        }
        return null;
    }
}
