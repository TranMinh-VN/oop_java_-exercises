package part8_design_pattern.facade_pattern;

/**
 * Class Projector - Máy chiếu
 *
 * Mô tả: Class này đại diện cho máy chiếu trong hệ thống Home Theater.
 *
 * Thuộc tính:
 * - isOn (boolean): Trạng thái bật/tắt của máy chiếu
 * - inputSource (String): Nguồn đầu vào hiện tại (ví dụ: "DVD", "HDMI", null)
 *
 * Các phương thức cần implement:
 * - turnOn(): Bật máy chiếu, set isOn = true
 * - turnOff(): Tắt máy chiếu, set isOn = false, set inputSource = null
 * - setInput(String source): Thiết lập nguồn đầu vào, lưu vào thuộc tính inputSource
 * - getStatus(): Trả về chuỗi mô tả trạng thái (format: "Projector [isOn=true/false, inputSource=nguồn/null]")
 * - toString(): Override để trả về kết quả giống getStatus()
 */
public class Projector implements Device {
    private boolean isOn;
    private String inputSource;

    public Projector() {
        this.isOn = false;
        this.inputSource = null;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Projector is now ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        inputSource = null;
        System.out.println("Projector is now OFF");
    }

    public void setInput(String source) {
        if (isOn) {
            this.inputSource = source;
            System.out.println("Projector input set to: " + source);
        } else {
            System.out.println("Cannot set input. Projector is OFF");
        }
    }

    @Override
    public String getStatus() {
        return "Projector [isOn=" + isOn + ", inputSource=" + (inputSource != null ? inputSource : "null") + "]";
    }

    @Override
    public String toString() {
        return getStatus();
    }
}
