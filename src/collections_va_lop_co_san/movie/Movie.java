package collections_va_lop_co_san.movie;

/**
 * Class Movie - Đại diện cho một bộ phim
 *
 * Mô tả:
 * - Class này đại diện cho một bộ phim trong bộ sưu tập
 * - Cần implements interface IMovie
 * - Cần implements Comparable<IMovie> để sắp xếp tự nhiên theo rating (giảm dần)
 *
 * Thuộc tính:
 * - movieId: String - Mã phim (unique)
 * - title: String - Tên phim
 * - director: String - Đạo diễn
 * - year: int - Năm phát hành
 * - rating: double - Đánh giá (0.0 - 10.0)
 * - genre: String - Thể loại phim
 * - duration: int - Thời lượng (phút)
 *
 * Yêu cầu:
 * 1. Tạo constructor với đầy đủ 7 tham số
 * 2. Implement tất cả methods từ interface IMovie
 * 3. Implement Comparable<IMovie>:
 *    - compareTo() sắp xếp theo rating GIẢM DẦN (phim rating cao hơn đứng trước)
 *    - Nếu rating bằng nhau thì so sánh theo year (mới hơn đứng trước - giảm dần)
 * 4. Override toString() để in thông tin phim theo format:
 *    "Movie[id='<id>', title='<title>', director='<dir>', year=<year>, rating=<rat>, genre='<gen>', duration=<dur>min]"
 */
class Movie implements IMovie, Comparable<IMovie> {
    // TODO: Khai báo các thuộc tính

    // TODO: Tạo constructor

    // TODO: Implement các methods từ interface

    // TODO: Implement compareTo() - Sắp xếp theo rating giảm dần, rồi year giảm dần

    // TODO: Override toString()
}

