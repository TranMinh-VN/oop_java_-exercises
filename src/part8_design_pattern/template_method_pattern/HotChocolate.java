package part8_design_pattern.template_method_pattern;

/**
 * Class HotChocolate - Chocolate nóng
 *
 * Mô tả: Class này kế thừa Beverage và implement các bước cụ thể để pha chocolate nóng.
 *
 * Thuộc tính:
 * - withCondiments (boolean): Có thêm gia vị hay không (mặc định true)
 * - name (String): Tên loại chocolate (mặc định "Hot Chocolate")
 * - chocolateType (String): Loại chocolate (ví dụ: "Dark", "Milk", "White")
 *
 * Các phương thức cần implement:
 * - Constructor(): Khởi tạo withCondiments = true, name = "Hot Chocolate", chocolateType = "Milk"
 * - Constructor(String chocolateType, boolean withCondiments): Khởi tạo với loại chocolate và tùy chọn gia vị
 * - brew(): In ra "Mixing [chocolateType] chocolate powder with hot water"
 * - addCondiments(): In ra "Adding Whipped Cream and Marshmallows"
 * - customerWantsCondiments(): Trả về giá trị của thuộc tính withCondiments
 * - toString(): Trả về chuỗi mô tả
 *   (format: "HotChocolate [name=X, chocolateType=Y, withCondiments=true/false]")
 */
public class HotChocolate extends Beverage {
    private boolean withCondiments;
    private String name;
    private String chocolateType;

    public HotChocolate() {
        this.withCondiments = true;
        this.name = "Hot Chocolate";
        this.chocolateType = "Milk";
    }

    public HotChocolate(String chocolateType, boolean withCondiments) {
        this.chocolateType = chocolateType;
        this.withCondiments = withCondiments;
        this.name = "Hot Chocolate";
    }



    @Override
    public String toString() {
        return "HotChocolate [name=" + name + ", chocolateType=" + chocolateType +
                ", withCondiments=" + withCondiments + "]";
    }
}
