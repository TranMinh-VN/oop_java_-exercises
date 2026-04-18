package solid.dichvu_hotel;

public interface Priceable {
    /**
     * Tính tổng giá
     * @return Tổng tiền
     */
    double calculateTotalPrice();

    /**
     * Lấy giá mỗi đêm
     * @return Giá mỗi đêm
     */
    double getPricePerNight();
}
