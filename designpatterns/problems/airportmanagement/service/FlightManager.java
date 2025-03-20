package problems.airportmanagement.service;

import problems.airportmanagement.domain.Airplane;
import problems.airportmanagement.domain.Flight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightManager {

    static List<Flight> flights = new ArrayList<>();

    public static Flight createFlight(String id, Airplane airplane, int durationOfFlight, LocalDateTime departureTime, String source, String destination, int totalSeats, int availableSeats, double price) {
        Flight flight = new Flight(id, airplane, durationOfFlight, departureTime, source, destination, totalSeats, availableSeats, price);
        flights.add(flight);
        return flight;
    }

    public static List<Flight> search(final String source, final String destination, final LocalDateTime departureTime) {
        List<Flight> searchResult = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getSource().equals(source) && flight.getDestination().equals(destination)) {
                searchResult.add(flight);
            }
        }
        return searchResult;
    }

    public static void showFlights(List<Flight> flights) {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
