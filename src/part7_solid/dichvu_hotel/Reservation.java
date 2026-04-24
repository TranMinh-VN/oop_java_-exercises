package part7_solid.dichvu_hotel;

/**
 * CLASS 2: Reservation - Đại diện cho một đặt phòng
 *
 * THUỘC TÍNH:
 * - reservationId: String - Mã đặt phòng (duy nhất)
 * - guestName: String - Tên khách
 * - guestEmail: String - Email khách
 * - guestPhone: String - Số điện thoại khách
 * - room: Room - Phòng được đặt
 * - checkInDate: String - Ngày check-in (format: dd/MM/yyyy)
 * - checkOutDate: String - Ngày check-out (format: dd/MM/yyyy)
 * - numberOfGuests: int - Số khách
 * - totalAmount: double - Tổng tiền
 * - status: String - Trạng thái (PENDING, CONFIRMED, PAID, CANCELLED)
 * - specialRequests: String - Yêu cầu đặc biệt (có thể null)
 *
 * YÊU CẦU:
 * 1. Implement các interface: Displayable, Validatable, Priceable
 * 2. Constructor nhận các tham số: reservationId, guestName, guestEmail, guestPhone,
 *    room, checkInDate, checkOutDate, numberOfGuests
 *    - totalAmount tính từ room.calculateTotalPrice()
 *    - status mặc định = "PENDING"
 *    - specialRequests mặc định = null
 * 3. Implement phương thức getDisplayInfo():
 *    - Format: "Reservation [reservationId] | Guest: [guestName] | Email: [guestEmail] | Phone: [guestPhone] | Room: [room.getRoomNumber()] | Dates: [checkInDate] to [checkOutDate] | Guests: [numberOfGuests] | Total: [totalAmount] VND | Status: [status]"
 * 4. Implement phương thức isValid():
 *    - reservationId không null và không rỗng
 *    - guestName không null và không rỗng
 *    - guestEmail chứa '@'
 *    - guestPhone không null và có độ dài >= 10
 *    - room không null và room.isValid() == true
 *    - checkInDate và checkOutDate không null
 *    - numberOfGuests > 0 và numberOfGuests <= room.getMaxGuests()
 *    - status là một trong: PENDING, CONFIRMED, PAID, CANCELLED
 * 5. Implement calculateTotalPrice():
 *    - Gọi room.calculateNights() để tính số đêm
 *    - Trả về room.getPricePerNight() * số đêm
 * 6. Implement getPricePerNight():
 *    - Trả về room.getPricePerNight()
 * 7. Phương thức confirm():
 *    - Kiểm tra status == "PENDING"
 *    - Đặt phòng: room.book(guestName, checkInDate, checkOutDate)
 *    - Set status = "CONFIRMED"
 *    - Throw InvalidReservationException nếu status không phải PENDING
 * 8. Phương thức pay():
 *    - Kiểm tra status == "CONFIRMED"
 *    - Set status = "PAID"
 *    - Throw PaymentFailedException nếu không thể thanh toán
 * 9. Phương thức cancel():
 *    - Kiểm tra status không phải "PAID" và không phải "CANCELLED"
 *    - Nếu status == "CONFIRMED" thì gọi room.cancelBooking()
 *    - Set status = "CANCELLED"
 *    - Throw InvalidReservationException nếu không thể hủy
 * 10. Phương thức setSpecialRequests(String requests):
 *     - Set specialRequests
 * 11. Phương thức getSpecialRequests(): trả về specialRequests
 * 12. Override toString() trả về getDisplayInfo()
 * 13. Tạo các getter cho tất cả thuộc tính
 */

public class Reservation implements Displayable, Validatable, Priceable {

}
