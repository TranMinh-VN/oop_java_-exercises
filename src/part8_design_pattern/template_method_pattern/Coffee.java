package part8_design_pattern.template_method_pattern;

/**
 * Class Coffee - Cà phê
 *
 * Mô tả: Class này kế thừa Beverage và implement các bước cụ thể để pha cà phê.
 *
 * Thuộc tính:
 * - withCondiments (boolean): Có thêm gia vị hay không (mặc định true)
 * - name (String): Tên loại cà phê (mặc định "Coffee")
 *
 * Các phương thức cần implement:
 * - Constructor(): Khởi tạo withCondiments = true, name = "Coffee"
 * - Constructor(boolean withCondiments): Khởi tạo với tùy chọn có gia vị hay không
 * - Constructor(String name, boolean withCondiments): Khởi tạo đầy đủ tên và tùy chọn gia vị
 * - brew(): In ra "Dripping Coffee through filter"
 * - addCondiments(): In ra "Adding Sugar and Milk"
 * - customerWantsCondiments(): Trả về giá trị của thuộc tính withCondiments
 * - toString(): Trả về chuỗi mô tả (format: "Coffee [name=X, withCondiments=true/false]")
 */
public class Coffee extends Beverage {
    private boolean withCondiments;
    private String name;

    public Coffee() {
        this.withCondiments = true;
        this.name = "Coffee";
    }

    public Coffee(boolean withCondiments) {
        this.withCondiments = withCondiments;
        this.name = "Coffee";
    }

    public Coffee(String name, boolean withCondiments) {
        this.name = name;
        this.withCondiments = withCondiments;
    }



    @Override
    public String toString() {
        return "Coffee [name=" + name + ", withCondiments=" + withCondiments + "]";
    }
}
