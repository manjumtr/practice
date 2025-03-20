package problems.airportmanagement.domain;

import java.util.List;

public class Airplane {
    private String id;
    private String model;
    private int capacity;
    private List<Seat> seats;

    public Airplane(int capacity, String id, String model, List<Seat> seats, List<Seat> availableSeats) {
        this.capacity = capacity;
        this.id = id;
        this.model = model;
        this.seats = seats;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", seats=" + seats +
                '}';
    }
}
