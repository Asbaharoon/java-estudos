package Collections.Set;

import java.util.Objects;

public class Series implements Comparable<Series> {
    private String title;
    private String genre;
    private Integer duration;

    Series(String title, String genre, Integer duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getDuration() {
        return duration;
    }

    @Override
    public java.lang.String toString() {
        return "{" +
                "title: " + title +
                ", genre: " + genre +
                ", duration: " + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(title, series.title) && Objects.equals(genre, series.genre) && Objects.equals(duration, series.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, duration);
    }

    @Override
    public int compareTo(Series serie) {
        int duration =  Integer.compare(this.getDuration(), serie.getDuration());
        if (duration != 0) return duration;
        return this.getGenre().compareTo(serie.getGenre());
    }
}
