package part8_design_pattern.template_method_pattern;

/**
 * Class Tea - Trà
 *
 * Mô tả: Class này kế thừa Beverage và implement các bước cụ thể để pha trà.
 *
 * Thuộc tính:
 * - withCondiments (boolean): Có thêm gia vị hay không (mặc định true)
 * - name (String): Tên loại trà (mặc định "Tea")
 *
 * Các phương thức cần implement:
 * - Constructor(): Khởi tạo withCondiments = true, name = "Tea"
 * - Constructor(boolean withCondiments): Khởi tạo với tùy chọn có gia vị hay không
 * - Constructor(String name, boolean withCondiments): Khởi tạo đầy đủ tên và tùy chọn gia vị
 * - brew(): In ra "Steeping the tea"
 * - addCondiments(): In ra "Adding Lemon"
 * - customerWantsCondiments(): Trả về giá trị của thuộc tính withCondiments
 * - toString(): Trả về chuỗi mô tả (format: "Tea [name=X, withCondiments=true/false]")
 */
public class Tea extends Beverage {
    private boolean withCondiments;
    private String name;

    public Tea() {
        this.withCondiments = true;
        this.name = "Tea";
    }

    public Tea(boolean withCondiments) {
        this.withCondiments = withCondiments;
        this.name = "Tea";
    }

    public Tea(String name, boolean withCondiments) {
        this.name = name;
        this.withCondiments = withCondiments;
    }



    @Override
    public String toString() {
        return "Tea [name=" + name + ", withCondiments=" + withCondiments + "]";
    }
}
