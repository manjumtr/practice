package problems.car_rental.service;

import problems.car_rental.domain.Car;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchService {

    public static List<Car> search(String model, double priceFrom, double priceTo, LocalDateTime fromDate, LocalDateTime toDate) {
        List<Car> availableCars = new ArrayList<>();
        List<Car> cars = CarService.getAllCars(model, priceFrom, priceTo);
        for (Car car : cars) {
            if (!BookingService.checkIfCarBooked(car, fromDate, toDate)) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }
}
