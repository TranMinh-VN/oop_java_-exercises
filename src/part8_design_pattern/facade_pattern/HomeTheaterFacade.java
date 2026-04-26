package part8_design_pattern.facade_pattern;

/**
 * Class HomeTheaterFacade - Facade Pattern
 *
 * Mô tả: Class này là Facade che giấu độ phức tạp của việc điều khiển nhiều thiết bị.
 *        Cung cấp các phương thức đơn giản để thực hiện các thao tác phức tạp.
 *
 * Thuộc tính:
 * - dvdPlayer (DVDPlayer): Đối tượng DVD player
 * - projector (Projector): Đối tượng máy chiếu
 * - soundSystem (SoundSystem): Đối tượng hệ thống âm thanh
 * - lights (Lights): Đối tượng hệ thống đèn
 *
 * Các phương thức cần implement:
 * - Constructor: Khởi tạo tất cả các đối tượng thiết bị
 * - watchMovie(String movie): Chuẩn bị xem phim
 *   + Tắt đèn (dim về 10)
 *   + Bật máy chiếu và set input là "DVD"
 *   + Bật sound system, set mode "Surround", volume 70
 *   + Bật DVD player và phát phim
 * - endMovie(): Kết thúc xem phim
 *   + Dừng và tắt DVD player
 *   + Tắt sound system
 *   + Tắt máy chiếu
 *   + Bật đèn về 100
 * - getStatus(): Trả về chuỗi mô tả trạng thái của TẤT CẢ thiết bị (mỗi thiết bị 1 dòng)
 * - toString(): Override để trả về kết quả giống getStatus()
 */
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
        this.lights = new Lights();
    }

    public void watchMovie(String movie) {
        System.out.println("\n=== Preparing to watch movie: " + movie + " ===");

        System.out.println("=== Enjoy your movie! ===\n");
    }

    public void endMovie() {
        System.out.println("\n=== Ending movie ===");

        System.out.println("=== Movie ended ===\n");
    }

    public String getStatus() {
        return dvdPlayer.getStatus() + "\n" +
                projector.getStatus() + "\n" +
                soundSystem.getStatus() + "\n" +
                lights.getStatus();
    }

    @Override
    public String toString() {
        return getStatus();
    }
}
