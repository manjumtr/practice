package problems.airportmanagement.domain;

import problems.airportmanagement.enums.SeatType;

public class Seat {
    private String id;
    private SeatType type;
    private boolean isAvailable;

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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void markAsBooked() {
        isAvailable = false;
    }

    public Seat(String id, SeatType type, boolean isAvailable) {
        this.id = id;
        this.type = type;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
