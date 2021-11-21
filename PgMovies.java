package com.tw;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPg(Movie[] movies) {
        Movie[] PgMovies = new Movie[movies.length];
        int idx = 0;
        for (Movie m : movies) {
            if (m.rating.equals("PG")) {
                PgMovies[idx] = m;
                idx ++;
            }
        }
        return PgMovies;
    }
}

class MovieMain {
    public static void main(String[] args) {
        Movie m = new Movie("Casino Royale", "Eon Productions", "PG-13");
    }

}
