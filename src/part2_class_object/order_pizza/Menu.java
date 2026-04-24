package part2_class_object.order_pizza;

import java.util.HashMap;
import java.util.Map;

/**
 * Lớp Menu hoạt động như một cơ sở dữ liệu giả để lưu trữ giá cả.
 * Việc tách riêng menu giúp dễ dàng cập nhật giá mà không cần sửa code
 * trong các lớp Pizza hay Order.
 */
public class Menu {
    // Map để lưu giá pizza: Key là "TênPizza-Size", Value là giá
    private static final Map<String, Double> PIZZA_PRICES = new HashMap<>();
    // Map để lưu giá topping
    private static final Map<String, Double> TOPPING_PRICES = new HashMap<>();

    // Khối static để khởi tạo dữ liệu menu khi lớp được tải
    static {
        // Giá Pizza
        PIZZA_PRICES.put("Hải sản-S", 150000.0);
        PIZZA_PRICES.put("Hải sản-M", 200000.0);
        PIZZA_PRICES.put("Hải sản-L", 250000.0);
        PIZZA_PRICES.put("Thập cẩm-S", 140000.0);
        PIZZA_PRICES.put("Thập cẩm-M", 190000.0);
        PIZZA_PRICES.put("Thập cẩm-L", 240000.0);

        // Giá Topping
        TOPPING_PRICES.put("Phô mai", 20000.0);
        TOPPING_PRICES.put("Xúc xích", 25000.0);
        TOPPING_PRICES.put("Nấm", 15000.0);
    }

    /**
     * Lấy giá cơ bản của một loại pizza theo tên và kích thước.
     *
     * @param name Tên pizza.
     * @param size Kích thước pizza.
     * @return Giá cơ bản, hoặc 0 nếu không tìm thấy.
     */
    public static double getPizzaBasePrice(String name, String size) {
        String key = name + "-" + size;
        return PIZZA_PRICES.getOrDefault(key, 0.0);
    }

    /**
     * Lấy giá của một loại topping.
     *
     * @param name Tên topping.
     * @return Giá của topping, hoặc 0 nếu không tìm thấy.
     */
    public static double getToppingPrice(String name) {
        return TOPPING_PRICES.getOrDefault(name, 0.0);
    }
}
