package part8_design_pattern.facade_pattern;

/**
 * Class SoundSystem - Hệ thống âm thanh
 *
 * Mô tả: Class này đại diện cho hệ thống âm thanh trong Home Theater.
 *
 * Thuộc tính:
 * - isOn (boolean): Trạng thái bật/tắt của hệ thống âm thanh
 * - volume (int): Mức âm lượng hiện tại (0-100)
 * - mode (String): Chế độ âm thanh (ví dụ: "Surround", "Stereo", null)
 *
 * Các phương thức cần implement:
 * - turnOn(): Bật hệ thống âm thanh, set isOn = true, volume = 50
 * - turnOff(): Tắt hệ thống âm thanh, set isOn = false, volume = 0, mode = null
 * - setVolume(int volume): Thiết lập âm lượng (giới hạn 0-100)
 * - setMode(String mode): Thiết lập chế độ âm thanh
 * - getStatus(): Trả về chuỗi mô tả trạng thái (format: "SoundSystem [isOn=true/false, volume=giá_trị, mode=chế_độ/null]")
 * - toString(): Override để trả về kết quả giống getStatus()
 */
public class SoundSystem implements Device {
    private boolean isOn;
    private int volume;
    private String mode;

    public SoundSystem() {
        this.isOn = false;
        this.volume = 0;
        this.mode = null;
    }

    @Override
    public void turnOn() {
        isOn = true;
        volume = 50;
        System.out.println("Sound System is now ON (Volume: 50)");
    }

    @Override
    public void turnOff() {
        isOn = false;
        volume = 0;
        mode = null;
        System.out.println("Sound System is now OFF");
    }

    public void setVolume(int volume) {
        if (isOn) {
            if (volume < 0) {
                this.volume = 0;
            } else if (volume > 100) {
                this.volume = 100;
            } else {
                this.volume = volume;
            }
            System.out.println("Volume set to: " + this.volume);
        } else {
            System.out.println("Cannot set volume. Sound System is OFF");
        }
    }

    public void setMode(String mode) {
        if (isOn) {
            this.mode = mode;
            System.out.println("Sound mode set to: " + mode);
        } else {
            System.out.println("Cannot set mode. Sound System is OFF");
        }
    }

    @Override
    public String getStatus() {
        return "SoundSystem [isOn=" + isOn + ", volume=" + volume + ", mode=" + (mode != null ? mode : "null") + "]";
    }

    @Override
    public String toString() {
        return getStatus();
    }
}
