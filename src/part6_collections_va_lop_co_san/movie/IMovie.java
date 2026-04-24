package part6_collections_va_lop_co_san.movie;

interface IMovie extends Comparable<IMovie>{
    String getMovieId();
    String getTitle();
    String getDirector();
    int getYear();
    double getRating();
    String getGenre();
    int getDuration();
}


