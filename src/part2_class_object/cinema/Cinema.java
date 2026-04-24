package part2_class_object.cinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp Cinema là trung tâm quản lý của hệ thống đặt vé.
 * Nó quản lý danh sách phim, suất chiếu và xử lý logic đặt vé.
 */
public class Cinema {
    private String name;
    private List<Movie> movies;
    private List<Showtime> showtimes;

    /**
     * Hàm khởi tạo cho một Cinema.
     * @param name Tên của rạp chiếu phim.
     */
    public Cinema(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.showtimes = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addShowtime(Showtime showtime) {
        showtimes.add(showtime);
    }

    /**
     * Hiển thị danh sách các phim đang được chiếu tại rạp.
     */
    public void displayMovies() {
        System.out.println("\n===== CÁC PHIM ĐANG CHIẾU TẠI " + name.toUpperCase() + " =====");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).toString());
        }
    }

    /**
     * Hiển thị các suất chiếu có sẵn cho một bộ phim cụ thể.
     * @param movie Phim cần tìm suất chiếu.
     * @return Danh sách các suất chiếu tìm thấy.
     */
    public List<Showtime> findShowtimesForMovie(Movie movie) {
        System.out.println("\n--- Các suất chiếu có sẵn cho phim '" + movie.getTitle() + "' ---");
        List<Showtime> availableShowtimes = new ArrayList<>();
        for (Showtime st : showtimes) {
            if (st.getMovie().equals(movie)) {
                availableShowtimes.add(st);
                System.out.println("- " + st.getFormattedShowtime());
            }
        }
        if (availableShowtimes.isEmpty()) {
            System.out.println("Hiện không có suất chiếu nào cho phim này.");
        }
        return availableShowtimes;
    }

    /**
     * HIỂU BIẾT CẦN HOÀN THIỆN 2
     *
     * Xử lý logic đặt vé cho một suất chiếu.
     * Quá trình này bao gồm việc kiểm tra tính hợp lệ của tất cả các ghế được yêu cầu
     * trước khi thực hiện đặt vé.
     *
     * @param showtime Suất chiếu khách hàng chọn.
     * @param seatNumbers Danh sách các mã ghế khách hàng muốn đặt (ví dụ: ["C4", "C5"]).
     * @return Đối tượng Ticket nếu đặt thành công.
     * Trả về null nếu việc đặt vé thất bại (do có ghế không tồn tại
     * hoặc đã được đặt trước).
     */
    public Ticket bookTickets(Showtime showtime, List<String> seatNumbers) {
        // ### VIẾT CODE CỦA BẠN VÀO ĐÂY ###
        // Yêu cầu (logic "tất cả hoặc không có gì"):

        // --- Giai đoạn 1: KIỂM TRA TÍNH HỢP LỆ ---
        // 1. Tạo một danh sách tạm thời (ví dụ: seatsToBook) để lưu các đối tượng Seat hợp lệ.
        // 2. Duyệt qua từng chuỗi 'seatNum' trong danh sách 'seatNumbers' đầu vào.
        // 3. Với mỗi 'seatNum', hãy dùng hàm showtime.findSeat(seatNum) để tìm đối tượng Seat tương ứng.
        // 4. **Kiểm tra các điều kiện thất bại:**
        //    a. Nếu 'seat' trả về là null (ghế không tồn tại), in ra thông báo lỗi và
        //       ngay lập tức trả về null để hủy toàn bộ giao dịch.
        //    b. Nếu 'seat' không null nhưng đã được đặt (dùng seat.isBooked()), in ra thông báo lỗi
        //       và cũng trả về null để hủy giao dịch.
        // 5. Nếu ghế vượt qua cả 2 bài kiểm tra trên, hãy thêm đối tượng 'seat' vào danh sách tạm thời 'seatsToBook'.

        // --- Giai đoạn 2: XÁC NHẬN ĐẶT VÉ ---
        // 6. Nếu vòng lặp ở trên kết thúc mà không trả về null, có nghĩa là tất cả các ghế yêu cầu đều hợp lệ và còn trống.
        // 7. Bây giờ, hãy duyệt qua danh sách 'seatsToBook' mà bạn vừa tạo.
        // 8. Với mỗi 'seat' trong danh sách này, gọi phương thức seat.book() để cập nhật trạng thái của nó thành "đã đặt".

        // --- Giai đoạn 3: TẠO VÉ ---
        // 9. Tạo một đối tượng Ticket mới và truyền vào 'showtime' cùng với danh sách 'seatsToBook'.
        // 10. In ra thông báo đặt vé thành công.
        // 11. Trả về đối tượng Ticket vừa tạo.
        return null; // Chỉnh sửa dòng này
    }


    // Getters
    public List<Movie> getMovies() {
        return movies;
    }

    // *** THÊM GETTER VÀO ĐÂY ***
    /**
     * Trả về tên của rạp chiếu phim.
     * @return Tên rạp chiếu.
     */
    public String getName() {
        return name;
    }
}
