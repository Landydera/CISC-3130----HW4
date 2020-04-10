package org.launchcode;

import java.util.HashSet;

/* Islande Derazin
 * CISC 3130, HW # 4
 */



public class Movie implements Comparable<Movie> {
    private String title;
    private int year;
    private HashSet<Genre> genre;
    private int movieId;


    public Movie(String title, int year, int movieId, HashSet<Genre> genre) {
        this.title = title;
        this.year = year;
        this.movieId = movieId;
        this.genre = genre;

    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public int getMovieId() {
        return movieId;
    }

    public HashSet<Genre> getGenre() {
        return genre;
    }


    @Override
    public int compareTo(Movie o) {
        return 0;
    }
}
private enum Genre {

    ACTION, ADVENTURE, ANIMATION, COMEDY, DRAMA, HORROR, ROMANCE,
    SCIFI, THRILLER;

    private int value = 1 + ordinal();

    /*
     * Returns the value of a particular genre
     * @return Genre's value
     */
    public int getValue() {
        return value;
    }
}


