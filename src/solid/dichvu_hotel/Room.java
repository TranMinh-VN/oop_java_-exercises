package solid.dichvu_hotel;

/**
 * CLASS 1: Room - Đại diện cho một phòng khách sạn
 *
 * THUỘC TÍNH:
 * - roomNumber: String - Số phòng (duy nhất)
 * - roomType: String - Loại phòng (SINGLE, DOUBLE, SUITE, DELUXE)
 * - pricePerNight: double - Giá mỗi đêm (phải > 0)
 * - maxGuests: int - Số khách tối đa
 * - isBooked: boolean - Trạng thái đã đặt hay chưa
 * - currentGuest: String - Tên khách hiện tại (null nếu chưa đặt)
 * - checkInDate: String - Ngày check-in hiện tại (null nếu chưa đặt)
 * - checkOutDate: String - Ngày check-out hiện tại (null nếu chưa đặt)
 *
 * YÊU CẦU:
 * 1. Implement các interface: Bookable, Displayable, Validatable, Priceable
 * 2. Constructor nhận các tham số: roomNumber, roomType, pricePerNight, maxGuests
 *    - isBooked mặc định = false
 *    - currentGuest, checkInDate, checkOutDate mặc định = null
 * 3. Implement phương thức book(String guestName, String checkInDate, String checkOutDate):
 *    - Kiểm tra nếu isBooked == true thì throw RoomNotAvailableException
 *    - Kiểm tra guestName không null và không rỗng
 *    - Kiểm tra checkInDate và checkOutDate không null
 *    - Set isBooked = true, lưu currentGuest, checkInDate, checkOutDate
 * 4. Implement phương thức cancelBooking():
 *    - Set isBooked = false
 *    - Set currentGuest, checkInDate, checkOutDate = null
 * 5. Implement phương thức isBooked(): trả về trạng thái đặt phòng
 * 6. Implement phương thức calculateTotalPrice():
 *    - Tính số đêm giữa checkInDate và checkOutDate (format: dd/MM/yyyy)
 *    - Trả về pricePerNight * số đêm
 *    - Nếu chưa đặt phòng thì trả về 0
 * 7. Implement phương thức getPricePerNight(): trả về pricePerNight
 * 8. Implement phương thức getDisplayInfo():
 *    - Format: "Room [roomNumber] | Type: [roomType] | Price: [pricePerNight] VND/night | Max Guests: [maxGuests] | Status: [Available/Booked by guestName (checkInDate - checkOutDate)]"
 * 9. Implement phương thức isValid():
 *    - roomNumber không null và không rỗng
 *    - roomType là một trong: SINGLE, DOUBLE, SUITE, DELUXE
 *    - pricePerNight > 0
 *    - maxGuests > 0
 * 10. Phương thức calculateNights(String checkIn, String checkOut):
 *     - Tính số đêm giữa 2 ngày (format: dd/MM/yyyy)
 *     - Giả sử format đúng, tính đơn giản: parse ngày và trừ
 * 11. Override toString() trả về getDisplayInfo()
 * 12. Tạo các getter cho tất cả thuộc tính
 */

public class Room implements Bookable, Displayable, Validatable, Priceable {

}
