package problems.airportmanagement.domain;

import problems.common.domain.User;

public class Booking {
    private String id;
    private Flight flight;
    private User user;
    private boolean isActive;
    private Seat seat;

    public Booking() {
    }

    public Booking(String id, Flight flight, User user, boolean isActive, Seat seat) {
        this.id = id;
        this.flight = flight;
        this.user = user;
        this.isActive = isActive;
        this.seat = seat;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", flight=" + flight +
                ", user=" + user +
                ", isActive=" + isActive +
                ", seat=" + seat +
                '}';
    }

    public void setUser(User user) {
        this.user = user;
    }
}
