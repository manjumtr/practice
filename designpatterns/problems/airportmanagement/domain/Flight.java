package problems.airportmanagement.domain;

import problems.airportmanagement.enums.SeatType;

import java.time.LocalDateTime;

public class Flight {
    private String id;
    private Airplane airplane;
    private String source;
    private String destination;
    private LocalDateTime departureTime;
    private int durationOfFlight;
    private int totalSeats;
    private int availableSeats;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getDurationOfFlight() {
        return durationOfFlight;
    }

    public void setDurationOfFlight(int durationOfFlight) {
        this.durationOfFlight = durationOfFlight;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getPrice(SeatType seat) {
        if (SeatType.BUSINESS.equals(seat)) {
            return this.price * 1.3;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight(String id, Airplane airplane, int durationOfFlight, LocalDateTime departureTime, String source, String destination, int totalSeats, int availableSeats, double price) {
        this.id = id;
        this.airplane = airplane;
        this.durationOfFlight = durationOfFlight;
        this.departureTime = departureTime;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", airplane=" + airplane +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", durationOfFlight=" + durationOfFlight +
                ", totalSeats=" + totalSeats +
                ", availableSeats=" + availableSeats +
                ", price=" + price +
                '}';
    }
}
