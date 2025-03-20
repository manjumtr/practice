public class SuperCar extends Car {

    public int firstRaceYear;
    public int numberOfTrophies;

    public SuperCar(String brand, String colour, String name, final int firstRaceYear, final int numberOfTrophies) {
        super(brand, colour, name);
        this.firstRaceYear = firstRaceYear;
        this.numberOfTrophies = numberOfTrophies;
    }

    public void getInfo() {
        System.out.println("This car has won " + this.numberOfTrophies + " trophies");
    }

    public String getSuperCarInfo() {
        return "Super Car";
    }

}
