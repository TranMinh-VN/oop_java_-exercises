package part6_collections_va_lop_co_san.quanli_danhsach_baihat;

/**
 * Class Playlist - Quản lý danh sách bài hát
 *
 * Mô tả:
 * - Class này quản lý playlist sử dụng ArrayList
 * - Cần implements interface IPlaylist
 * - SỬ DỤNG ITERATOR để duyệt và xử lý danh sách
 *
 * Thuộc tính:
 * - songs: List<ISong> - Danh sách bài hát (sử dụng ArrayList)
 *
 * Yêu cầu:
 * 1. Tạo constructor khởi tạo ArrayList rỗng
 * 2. Implement các methods:
 *    - addSong(): Thêm bài hát vào playlist
 *    - removeSong(): Xóa bài hát theo ID
 *    - getSong(): Lấy bài hát theo ID
 *    - getAllSongs(): Trả về List tất cả bài hát
 *    - getTotalSongs(): Trả về tổng số bài hát
 *    - getTotalDuration(): Trả về tổng thời lượng của playlist (giây)
 *    - removeByGenre(): Xóa tất cả bài hát của một thể loại (DÙNG ITERATOR)
 *    - removeSongsLongerThan(): Xóa bài hát có duration > maxDuration (DÙNG ITERATOR)
 *    - findSongsByArtist(): Tìm tất cả bài hát của một nghệ sĩ (DÙNG ITERATOR)
 *    - printAllSongs(): In tất cả bài hát bằng for-each loop
 *    - printSongsWithIterator(): In tất cả bài hát DÙNG ITERATOR với hasNext()
 * 3. Override toString() để in danh sách bài hát
 *
 * LƯU Ý QUAN TRỌNG:
 * - Các method removeByGenre() và removeSongsLongerThan() BẮT BUỘC dùng Iterator.remove()
 * - Method findSongsByArtist() và printSongsWithIterator() BẮT BUỘC dùng iterator()
 * - Phải sử dụng hasNext() và next() trong vòng lặp iterator
 */
class Playlist implements IPlaylist {
    // TODO: Khai báo thuộc tính

    // TODO: Tạo constructor

    // TODO: Implement các methods từ interface
    // CHÚ Ý: removeByGenre() và removeSongsLongerThan() PHẢI dùng Iterator.remove()
    // CHÚ Ý: findSongsByArtist() và printSongsWithIterator() PHẢI dùng iterator()

    // TODO: Override toString()
}
