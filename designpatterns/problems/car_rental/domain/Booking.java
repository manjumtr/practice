package problems.car_rental.domain;


import problems.car_rental.enums.BookingStatus;

import java.time.LocalDateTime;

public class Booking {

    private String id;
    private Car car;
    private LocalDateTime from;
    private LocalDateTime to;
    private BookingStatus status;

    public Booking(String id, Car car, LocalDateTime from, LocalDateTime to,BookingStatus status) {
        this.id = id;
        this.car = car;
        this.from = from;
        this.to = to;
        this.status=status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public void markAsCancellecd() {
        this.status = BookingStatus.CANCELLED;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", car=" + car +
                ", from=" + from +
                ", to=" + to +
                ", status=" + status +
                '}';
    }
}
