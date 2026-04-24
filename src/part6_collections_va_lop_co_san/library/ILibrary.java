package part6_collections_va_lop_co_san.library;

interface ILibrary {
    void addBook(IBook book);
    void removeBook(String title);
    IBook findBookByTitle(String title);
    java.util.List<IBook> findBooksByAuthor(String author);
    java.util.List<IBook> getAllBooks();
    int getTotalBooks();
    double getTotalValue();
    java.util.List<IBook> sortBooksByPrice();
}
