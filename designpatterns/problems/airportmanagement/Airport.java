package problems.airportmanagement;

import problems.airportmanagement.domain.*;
import problems.airportmanagement.enums.SeatType;
import problems.airportmanagement.service.AirplaneManager;
import problems.airportmanagement.service.BookingManager;
import problems.airportmanagement.service.FlightManager;
import problems.common.domain.User;
import problems.common.enums.Role;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Airport {
    public static void main(String[] args) {
        User manju = new User("28", Role.NORMAL, "Manju");
        User virat = new User("18", Role.NORMAL, "Virat");

        Seat economy = new Seat("ECO001", SeatType.ECONOMY, true);
        Seat business = new Seat("BUS001", SeatType.BUSINESS, true);
        List<Seat> seats = Arrays.asList(economy, business);
        Airplane airbus = AirplaneManager.createAirplane("AIR001", "AIRBUS", 2, seats, seats);
        Airplane boing = AirplaneManager.createAirplane("BOI001", "BOING", 2, seats, seats);

        Flight blrMum = FlightManager.createFlight("BLRMUM0930", airbus, 120, LocalDateTime.of(2025, 1, 1, 9, 30), "BLR", "MUM", 2, 2, 1000.00);
        Flight blrDel = FlightManager.createFlight("BLRDEL2130", boing, 200, LocalDateTime.of(2025, 1, 1, 21, 30), "BLR", "DEL", 2, 2, 1900.00);


        System.out.println("Before Booking...");
        FlightManager.showFlights(FlightManager.search("BLR", "MUM", null));

        Booking manjuBooking = BookingManager.bookFlight(blrMum, economy, manju);
        Booking viratBooking = BookingManager.bookFlight(blrMum, business, virat);

        System.out.println("After Booking...");
        FlightManager.showFlights(FlightManager.search("BLR", "MUM", null));

        System.out.println("Active Booking...");
        BookingManager.showAllActiveBookings();

        System.out.println("Cancelling Manju's booking...");
        BookingManager.cancelFlight(manjuBooking);

        System.out.println("Active Booking after cancellation...");
        BookingManager.showAllActiveBookings();


    }
}
