package problems.bookmyshow.service;

import problems.bookmyshow.domain.Booking;
import problems.bookmyshow.domain.Seat;
import problems.bookmyshow.domain.Show;
import problems.bookmyshow.enums.BookingStatus;
import problems.bookmyshow.enums.SeatStatus;
import problems.common.domain.User;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private static List<Booking> bookings = new ArrayList<>();

    public static Booking book(Show show, User user, List<Seat> seats) {

        double amount = 0;
        for (Seat seat : seats) {
            if (SeatStatus.BOOKED.equals(seat.getStatus())) {
                System.out.println("Seat : " + seat.getId() + " is already booked");
            } else {
                seat.markBooked();
                amount += seat.getPrice();
            }
        }
        Booking booking = new Booking(show, seats, user, BookingStatus.ACTIVE, amount);
        bookings.add(booking);
        return booking;
    }

    public void showActiveBookings() {
        for (Booking booking : bookings) {
            if (BookingStatus.ACTIVE.equals(booking.getStatus())) {
                System.out.println(booking);
            }
        }
    }
}
