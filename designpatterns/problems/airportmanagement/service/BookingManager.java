package problems.airportmanagement.service;

import problems.airportmanagement.domain.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import problems.common.domain.User;

public class BookingManager {

    static List<Booking> bookings = new ArrayList<>();

    public static Booking bookFlight(final Flight flight, Seat seat, User user) {
        Airplane airplane = flight.getAirplane();
        boolean seatFound = false;

        System.out.println("Booking flight for " + user.getName() + ", with seat id : " + seat.getId());

        for (Seat airplaneSeat : airplane.getSeats()) {
            if (airplaneSeat.equals(seat) && airplaneSeat.isAvailable()) {
                airplaneSeat.markAsBooked();
                flight.setAvailableSeats(flight.getAvailableSeats() - 1);
                seatFound = true;
            }
        }
        if (!seatFound) {
            System.out.println("Seat Not Available");
            return new Booking();
        }


        final String bookingId = flight.getId() + LocalDateTime.now().toString() + seat.getId();
        Booking booking = new Booking(bookingId, flight, user, true, seat);
        bookings.add(booking);

        return booking;
    }

    public static void cancelFlight(Booking booking) {
        Flight flight = booking.getFlight();
        booking.getSeat().setAvailable(true);
        flight.setAvailableSeats(flight.getAvailableSeats() + 1);
        booking.setActive(false);
    }

    public static void showAllActiveBookings() {
        for (Booking booking : bookings) {
            if (booking.isActive())
                System.out.println(booking);
        }
    }
}
