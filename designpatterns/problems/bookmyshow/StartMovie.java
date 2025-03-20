package problems.bookmyshow;

import problems.bookmyshow.domain.*;
import problems.bookmyshow.enums.PaymentType;
import problems.bookmyshow.enums.SeatStatus;
import problems.bookmyshow.enums.SeatType;
import problems.bookmyshow.service.BookingService;
import problems.bookmyshow.service.PaymentService;
import problems.bookmyshow.service.TheaterService;
import problems.common.domain.User;
import problems.common.enums.Role;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartMovie {
    public static void main(String[] args) {

        User manju = new User("U001", Role.NORMAL, "Manju");
        Movie kgf = new Movie("M001", "KGF", "Blockbuster Movie of Yash", 180);
        List<Seat> seats = new ArrayList<>();
        Seat economySeat = new Seat("ECO1", SeatType.ECONOMY, 150, SeatStatus.AVAILABLE);
        Seat premiumSeat = new Seat("PRE1", SeatType.PREMIUM, 250, SeatStatus.AVAILABLE);
        seats.add(economySeat);
        seats.add(premiumSeat);
//        for (int i = 1; i <= 10; i++) {
//            economySeat = new Seat("ECO" + i, SeatType.ECONOMY, 150, SeatStatus.AVAILABLE);
//            premiumSeat = new Seat("PRE" + i, SeatType.PREMIUM, 250, SeatStatus.AVAILABLE);
//            seats.add(economySeat);
//            seats.add(premiumSeat);
//        }
        Show show1030 = new Show("S001", kgf, LocalDateTime.of(2024, 1, 1, 10, 30), seats);
        Show show1100 = new Show("S001", kgf, LocalDateTime.of(2024, 1, 1, 11, 0), seats);
        Theater pvr = new Theater("T001", "PVR", "Bengaluru", 2, Arrays.asList(show1030, show1100));

        TheaterService.addTheater(pvr);

        System.out.println("All Theaters");
        TheaterService.showAllTheater();
        System.out.println("------");


        List<Theater> theaters = TheaterService.search("KGF");
        TheaterService.showAllTheater(theaters);

        Booking booking = BookingService.book(show1030, manju, Arrays.asList(economySeat));
        PaymentService.paymentService(PaymentType.PHONEPE);
        PaymentService.pay(booking.getPrice());
        TheaterService.showAllTheater(theaters);
    }
}
