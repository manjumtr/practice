package problems.bookmyshow.domain;

import problems.bookmyshow.enums.SeatStatus;
import problems.bookmyshow.enums.SeatType;

public class Seat {
    private String id;
    private SeatType type;

    public Seat(String id, SeatType type, double price, SeatStatus status) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    private double price;
    private SeatStatus status;

    public void markBooked() {
        this.status = SeatStatus.BOOKED;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
