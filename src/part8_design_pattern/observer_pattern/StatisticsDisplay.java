package part8_design_pattern.observer_pattern;

/**
 * Class StatisticsDisplay - Hiển thị thống kê
 *
 * Mô tả: Class này là một Observer, theo dõi và hiển thị nhiệt độ trung bình,
 *        nhiệt độ cao nhất và thấp nhất.
 *
 * Thuộc tính:
 * - maxTemp (float): Nhiệt độ cao nhất (khởi tạo = 0)
 * - minTemp (float): Nhiệt độ thấp nhất (khởi tạo = 200)
 * - tempSum (float): Tổng nhiệt độ (để tính trung bình)
 * - numReadings (int): Số lần đọc dữ liệu
 * - weatherStation (Subject): Tham chiếu đến Subject
 *
 * Các phương thức cần implement:
 * - Constructor(Subject weatherStation): Lưu tham chiếu và đăng ký làm observer
 * - update(float temperature, float humidity, float pressure):
 *   + Cập nhật tempSum += temperature
 *   + Tăng numReadings
 *   + Cập nhật maxTemp nếu temperature > maxTemp
 *   + Cập nhật minTemp nếu temperature < minTemp
 *   + Gọi display()
 * - display(): In ra "Avg/Max/Min temperature = [avg]/[max]/[min]"
 * - toString(): Override để trả về chuỗi mô tả
 *   (format: "StatisticsDisplay [avgTemp=X, maxTemp=Y, minTemp=Z, numReadings=N]")
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp;
    private float minTemp;
    private float tempSum;
    private int numReadings;
    private Subject weatherStation;

    public StatisticsDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        this.maxTemp = 0.0f;
        this.minTemp = 200.0f;
        this.tempSum = 0.0f;
        this.numReadings = 0;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        float avgTemp = numReadings > 0 ? tempSum / numReadings : 0;
        System.out.println("Avg/Max/Min temperature = " + avgTemp + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public String toString() {
        float avgTemp = numReadings > 0 ? tempSum / numReadings : 0;
        return "StatisticsDisplay [avgTemp=" + avgTemp + ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp + ", numReadings=" + numReadings + "]";
    }
}
