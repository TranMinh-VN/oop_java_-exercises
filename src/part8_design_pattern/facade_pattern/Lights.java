package part8_design_pattern.facade_pattern;

/**
 * Class Lights - Hệ thống đèn
 *
 * Mô tả: Class này đại diện cho hệ thống đèn trong phòng chiếu.
 *
 * Thuộc tính:
 * - brightness (int): Độ sáng của đèn (0-100, 0 là tắt)
 *
 * Các phương thức cần implement:
 * - turnOn(): Bật đèn với độ sáng 100
 * - turnOff(): Tắt đèn, set brightness = 0
 * - dim(int level): Điều chỉnh độ sáng (giới hạn 0-100)
 * - getStatus(): Trả về chuỗi mô tả trạng thái (format: "Lights [brightness=giá_trị]")
 * - toString(): Override để trả về kết quả giống getStatus()
 */
public class Lights implements Device {
    private int brightness;

    public Lights() {
        this.brightness = 0;
    }

    @Override
    public void turnOn() {
        brightness = 100;
        System.out.println("Lights are now ON (Brightness: 100)");
    }

    @Override
    public void turnOff() {
        brightness = 0;
        System.out.println("Lights are now OFF");
    }

    public void dim(int level) {
        if (level < 0) {
            this.brightness = 0;
        } else if (level > 100) {
            this.brightness = 100;
        } else {
            this.brightness = level;
        }
        System.out.println("Lights dimmed to: " + this.brightness);
    }

    @Override
    public String getStatus() {
        return "Lights [brightness=" + brightness + "]";
    }

    @Override
    public String toString() {
        return getStatus();
    }
}
