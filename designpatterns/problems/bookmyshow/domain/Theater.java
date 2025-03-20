package problems.bookmyshow.domain;

import java.util.List;

public class Theater {
    private String id;
    private String name;
    private String city;
    private int numberOfShows;
    private List<Show> shows;

    public Theater(String id, String name, String city, int numberOfShows, List<Show> shows) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.numberOfShows = numberOfShows;
        this.shows = shows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", numberOfShows=" + numberOfShows +
                ", shows=" + shows +
                '}';
    }
}
