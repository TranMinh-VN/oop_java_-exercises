package part8_design_pattern.observer_pattern;

/**
 * Class ForecastDisplay - Hiển thị dự báo
 *
 * Mô tả: Class này là một Observer, dự báo thời tiết dựa trên thay đổi áp suất.
 *
 * Thuộc tính:
 * - currentPressure (float): Áp suất hiện tại (khởi tạo = 1013.0)
 * - lastPressure (float): Áp suất lần trước (khởi tạo = 1013.0)
 * - weatherStation (Subject): Tham chiếu đến Subject
 *
 * Các phương thức cần implement:
 * - Constructor(Subject weatherStation): Lưu tham chiếu và đăng ký làm observer
 * - update(float temperature, float humidity, float pressure):
 *   + Lưu currentPressure vào lastPressure
 *   + Cập nhật currentPressure = pressure
 *   + Gọi display()
 * - display(): Hiển thị dự báo:
 *   + Nếu currentPressure > lastPressure: "Forecast: Improving weather on the way!"
 *   + Nếu currentPressure == lastPressure: "Forecast: More of the same"
 *   + Nếu currentPressure < lastPressure: "Forecast: Watch out for cooler, rainy weather"
 * - toString(): Override để trả về chuỗi mô tả
 *   (format: "ForecastDisplay [currentPressure=X, lastPressure=Y]")
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure;
    private float lastPressure;
    private Subject weatherStation;

    public ForecastDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        this.currentPressure = 1013.0f;
        this.lastPressure = 1013.0f;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public String toString() {
        return "ForecastDisplay [currentPressure=" + currentPressure + ", lastPressure=" + lastPressure + "]";
    }
}
