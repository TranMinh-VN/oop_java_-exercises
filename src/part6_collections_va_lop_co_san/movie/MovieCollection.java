package part6_collections_va_lop_co_san.movie;

/**
 * Class MovieCollection - Quản lý bộ sưu tập phim
 *
 * Mô tả:
 * - Class này quản lý bộ sưu tập phim sử dụng ArrayList
 * - Cần implements interface IMovieCollection
 * - Sử dụng Collections.sort() với Comparable và Comparator
 *
 * Thuộc tính:
 * - movies: List<IMovie> - Danh sách phim (sử dụng ArrayList)
 *
 * Yêu cầu:
 * 1. Tạo constructor khởi tạo ArrayList rỗng
 * 2. Implement các methods:
 *    - addMovie(): Thêm phim
 *    - removeMovie(): Xóa phim theo ID
 *    - getMovie(): Lấy phim theo ID
 *    - getAllMovies(): Trả về List tất cả phim
 *    - getTotalMovies(): Trả về tổng số phim
 *    - sortByNaturalOrder(): Sắp xếp theo thứ tự tự nhiên (dùng Comparable - rating giảm dần)
 *    - sortByRating(): Sắp xếp theo rating tăng dần (dùng MovieComparators.byRating)
 *    - sortByYear(): Sắp xếp theo year tăng dần (dùng MovieComparators.byYear)
 *    - sortByTitle(): Sắp xếp theo title A-Z (dùng MovieComparators.byTitle)
 *    - sortByDuration(): Sắp xếp theo duration tăng dần (dùng MovieComparators.byDuration)
 *    - sortByGenreThenRating(): Sắp xếp theo genre rồi rating (dùng MovieComparators)
 *    - getMoviesByGenre(): Lấy phim theo thể loại
 *    - getMoviesByDirector(): Lấy phim theo đạo diễn
 *    - getAverageRating(): Tính rating trung bình
 *    - getTopRatedMovies(): Lấy phim có rating >= minRating
 * 3. Override toString() để in danh sách phim
 *
 * LƯU Ý:
 * - Sử dụng Collections.sort() để sắp xếp
 * - Các method sort phải tạo copy của list trước khi sort (không thay đổi list gốc)
 */
class MovieCollection implements IMovieCollection {
    // TODO: Khai báo thuộc tính

    // TODO: Tạo constructor

    // TODO: Implement các methods từ interface
    // CHÚ Ý: Các method sort phải dùng Collections.sort() với Comparable hoặc Comparator

    // TODO: Override toString()
}
