package part8_design_pattern.template_method_pattern;


/**
 * Abstract class Beverage - Đồ uống
 *
 * Mô tả: Class trừu tượng định nghĩa template method cho quy trình pha đồ uống.
 *        Template method này không thể bị override.
 */
public abstract class Beverage {

    /**
     * Template Method - Định nghĩa khung quy trình pha đồ uống
     * Phương thức này là final, không thể bị override
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * Phương thức chung cho tất cả đồ uống
     */
    private void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * Phương thức chung cho tất cả đồ uống
     */
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Phương thức trừu tượng - subclass phải implement
     */
    protected abstract void brew();

    /**
     * Phương thức trừu tượng - subclass phải implement
     */
    protected abstract void addCondiments();

    /**
     * Hook method - subclass có thể override để thay đổi hành vi
     * Mặc định trả về true
     */
    protected boolean customerWantsCondiments() {
        return true;
    }
}
