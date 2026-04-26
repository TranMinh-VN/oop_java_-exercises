package part8_design_pattern.facade_pattern;

/**
 * Class DVDPlayer - Đầu phát DVD
 *
 * Mô tả: Class này đại diện cho một đầu phát DVD trong hệ thống Home Theater.
 *
 * Thuộc tính:
 * - isOn (boolean): Trạng thái bật/tắt của DVD player
 * - movie (String): Tên phim đang được phát
 *
 * Các phương thức cần implement:
 * - turnOn(): Bật DVD player, set isOn = true
 * - turnOff(): Tắt DVD player, set isOn = false, set movie = null
 * - play(String movie): Phát phim với tên được truyền vào, lưu vào thuộc tính movie
 * - stop(): Dừng phát phim, set movie = null
 * - getStatus(): Trả về chuỗi mô tả trạng thái (format: "DVDPlayer [isOn=true/false, movie=tên_phim/null]")
 * - toString(): Override để trả về kết quả giống getStatus()
 */
public class DVDPlayer implements Device {
    private boolean isOn;
    private String movie;

    public DVDPlayer() {
        this.isOn = false;
        this.movie = null;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("DVD Player is now ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        movie = null;
        System.out.println("DVD Player is now OFF");
    }

    public void play(String movie) {
        if (isOn) {
            this.movie = movie;
            System.out.println("Playing movie: " + movie);
        } else {
            System.out.println("Cannot play. DVD Player is OFF");
        }
    }

    public void stop() {
        if (isOn && movie != null) {
            System.out.println("Stopping movie: " + movie);
            movie = null;
        } else {
            System.out.println("No movie is playing");
        }
    }

    @Override
    public String getStatus() {
        return "DVDPlayer [isOn=" + isOn + ", movie=" + (movie != null ? movie : "null") + "]";
    }

    @Override
    public String toString() {
        return getStatus();
    }
}
