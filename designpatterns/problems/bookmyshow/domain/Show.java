package problems.bookmyshow.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
    private String id;
    private LocalDateTime startTime;
    private Movie movie;
    private List<Seat> seats;

    public Show(String id, Movie movie, LocalDateTime startTime, List<Seat> seats) {
        this.id = id;
        this.movie = movie;
        this.startTime = startTime;
        this.seats = seats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id='" + id + '\'' +
                ", startTime=" + startTime +
                ", movie=" + movie +
                ", seats=" + seats +
                '}';
    }
}
