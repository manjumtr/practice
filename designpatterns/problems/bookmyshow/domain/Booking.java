package problems.bookmyshow.domain;

import problems.bookmyshow.enums.BookingStatus;
import problems.common.domain.User;

import java.util.List;

public class Booking {
    private Show show;
    private List<Seat> bookedSeats;
    private User user;
    private BookingStatus status;
    private double price;

    public Booking(Show show, List<Seat> bookedSeats, User user, BookingStatus status, double price) {
        this.show = show;
        this.bookedSeats = bookedSeats;
        this.user = user;
        this.status = status;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "show=" + show +
                ", bookedSeats=" + bookedSeats +
                ", user=" + user +
                ", status=" + status +
                '}';
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BookingStatus isActive() {
        return status;
    }

    public void setActive(BookingStatus status) {
        status = status;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
