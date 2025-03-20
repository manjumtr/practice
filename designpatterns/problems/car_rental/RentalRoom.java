package problems.car_rental;


import problems.car_rental.domain.Booking;
import problems.car_rental.domain.Car;
import problems.car_rental.service.BookingService;
import problems.car_rental.service.CarService;
import problems.car_rental.service.SearchService;
import problems.common.domain.User;
import problems.common.enums.Role;

import java.time.LocalDateTime;
import java.util.List;

public class RentalRoom {
    public static void main(String[] args) {
        User manju = new User("U001", Role.NORMAL, "manju");
        Car nexon = CarService.addCar("N001", "Nexon", "KA02LC4727", 2024, 2000.00);
        List<Car> avaialableCars = SearchService.search("Nexon", 500, 3000, LocalDateTime.now(), LocalDateTime.now());
        CarService.showAllCars(avaialableCars);

        Booking booking = BookingService.book(nexon, LocalDateTime.of(2025, 1, 1, 10, 30), LocalDateTime.of(2025, 1, 1, 17, 30));
        BookingService.showAllActiveBooking();

        CarService.showAllCars(SearchService.search("Nexon", 500, 3000, LocalDateTime.now(), LocalDateTime.now()));
        BookingService.cancel(booking);
        BookingService.showAllActiveBooking();

    }
}
