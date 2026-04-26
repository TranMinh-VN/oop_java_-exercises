package part8_design_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Class WeatherStation - Trạm thời tiết (Subject)
 *
 * Mô tả: Class này là Subject trong Observer Pattern, lưu trữ dữ liệu thời tiết
 *        và thông báo cho tất cả các Observer khi có thay đổi.
 *
 * Thuộc tính:
 * - observers (List<Observer>): Danh sách các observer đang theo dõi
 * - temperature (float): Nhiệt độ hiện tại (°C)
 * - humidity (float): Độ ẩm hiện tại (%)
 * - pressure (float): Áp suất hiện tại (hPa)
 *
 * Các phương thức cần implement:
 * - Constructor: Khởi tạo danh sách observers (ArrayList)
 * - registerObserver(Observer observer): Thêm observer vào danh sách
 * - removeObserver(Observer observer): Xóa observer khỏi danh sách
 * - notifyObservers(): Gọi phương thức update() của tất cả observers
 * - setMeasurements(float temperature, float humidity, float pressure):
 *   Cập nhật dữ liệu thời tiết và gọi notifyObservers()
 * - getTemperature(), getHumidity(), getPressure(): Getter cho các thuộc tính
 * - toString(): Override để trả về chuỗi mô tả trạng thái
 *   (format: "WeatherStation [temperature=X, humidity=Y, pressure=Z, observers=N]")
 */
public class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer registered. Total observers: " + observers.size());
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed. Total observers: " + observers.size());
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        System.out.println("\n=== Weather Station: New measurements received ===");

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "WeatherStation [temperature=" + temperature + ", humidity=" + humidity +
                ", pressure=" + pressure + ", observers=" + observers.size() + "]";
    }
}
