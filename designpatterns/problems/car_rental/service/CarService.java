package problems.car_rental.service;

import problems.car_rental.domain.Car;
import problems.car_rental.enums.BookingStatus;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private static List<Car> cars = new ArrayList<>();

    public static Car addCar(String id, String model, String number, int year, double price) {
        Car car = new Car(id, model, number, year, price);
        cars.add(car);
        return car;
    }

    public static void showAllCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void showAllCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static List<Car> getAllCars() {
        return cars;

    }

    public static List<Car> getAllCars(String model, double priceFrom, double priceTo) {
        List<Car> searchResult = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model) && (priceFrom <= car.getPrice()) && (priceTo >= car.getPrice())) {
                searchResult.add(car);
            }
        }
        return searchResult;
    }
}