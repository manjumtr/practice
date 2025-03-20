package problems.airportmanagement.service;

import problems.airportmanagement.domain.Airplane;
import problems.airportmanagement.domain.Seat;

import java.util.ArrayList;
import java.util.List;

public class AirplaneManager {
    static List<Airplane> airplanes = new ArrayList<>();

    public static Airplane createAirplane(String id, String model, int capacity, List<Seat> seats, List<Seat> availableSeats) {
        Airplane airplane = new Airplane(capacity, id, model, seats, availableSeats);
        airplanes.add(airplane);
        return airplane;
    }
}
