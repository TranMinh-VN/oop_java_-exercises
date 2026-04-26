package part8_design_pattern.observer_pattern;

/**
 * Class CurrentConditionsDisplay - Hiển thị điều kiện hiện tại
 *
 * Mô tả: Class này là một Observer, hiển thị nhiệt độ và độ ẩm hiện tại.
 *
 * Thuộc tính:
 * - temperature (float): Nhiệt độ hiện tại
 * - humidity (float): Độ ẩm hiện tại
 * - weatherStation (Subject): Tham chiếu đến Subject để có thể hủy đăng ký
 *
 * Các phương thức cần implement:
 * - Constructor(Subject weatherStation): Lưu tham chiếu và đăng ký làm observer
 * - update(float temperature, float humidity, float pressure):
 *   Cập nhật temperature và humidity, sau đó gọi display()
 * - display(): In ra "Current conditions: [temperature]°C and [humidity]% humidity"
 * - toString(): Override để trả về chuỗi mô tả
 *   (format: "CurrentConditionsDisplay [temperature=X, humidity=Y]")
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherStation;

    public CurrentConditionsDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "°C and " + humidity + "% humidity");
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay [temperature=" + temperature + ", humidity=" + humidity + "]";
    }
}
