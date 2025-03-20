package problems.bookmyshow.service;

import problems.bookmyshow.domain.Show;
import problems.bookmyshow.domain.Theater;

import java.util.ArrayList;
import java.util.List;

public class TheaterService {
    private static List<Theater> theaters = new ArrayList<>();

    public static void addTheater(Theater theater) {
        theaters.add(theater);
    }

    public static List<Theater> search(String movieName) {
        List<Theater> searchResult = new ArrayList<>();
        for (Theater theater : theaters) {
            for (Show show : theater.getShows()) {
                if (show.getMovie().getName().equals(movieName)) {
                    searchResult.add(theater);
                }
            }
        }
        return searchResult;
    }

    public static void showAllTheater() {
        for (Theater theater : theaters) {
            System.out.println(theater);
        }
    }

    public static void showAllTheater(List<Theater> theaters) {
        for (Theater theater : theaters) {
            System.out.println(theater);
        }
    }
}
