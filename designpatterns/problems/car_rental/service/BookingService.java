package problems.car_rental.service;


import problems.car_rental.domain.Booking;
import problems.car_rental.domain.Car;
import problems.car_rental.enums.BookingStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private static List<Booking> bookings = new ArrayList<>();

    public static Booking book(Car car, LocalDateTime from, LocalDateTime to) {
        Booking newBooking = null;
        if (!bookings.isEmpty()) {
            for (Booking booking : bookings) {
                if (checkIfGivenTimeFallsInCarBooking(car, from, to)) {
                    System.out.println("Car is not available at that time");
                } else {
                    newBooking = new Booking("Book1", car, from, to, BookingStatus.ACTIVE);
                    bookings.add(newBooking);
                }
            }
        } else {
            newBooking = new Booking("Book1", car, from, to, BookingStatus.ACTIVE);
            bookings.add(newBooking);

        }
        return newBooking;
    }

    public static void cancel(Booking booking) {
        for (Booking book : bookings) {
            if (book.equals(booking)) {
                book.markAsCancellecd();
            }

        }
    }

    public static void showAllActiveBooking() {

        for (Booking booking : bookings) {
            if (booking.getStatus().equals(BookingStatus.ACTIVE))
                System.out.println(booking);
        }
    }

    public static boolean checkIfCarBooked(Car car, LocalDateTime from, LocalDateTime to) {
        if (checkIfGivenTimeFallsInCarBooking(car, from, to)) {
            return true;
        }
        return false;
    }

    public static boolean checkIfGivenTimeFallsInCarBooking(Car car, LocalDateTime from, LocalDateTime to) {
        for (Booking booking : bookings) {
            if ((booking.getCar().equals(car) && booking.getFrom().isBefore(from) && booking.getTo().isAfter(to)) && booking.getStatus().equals(BookingStatus.ACTIVE)) {
                return true;
            }
        }
        return false;
    }
}