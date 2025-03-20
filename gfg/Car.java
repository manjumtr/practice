public class Car {
    public String brand;
    public String colour;
    public String name;

    public Car(final String brand, final String colour, final String name) {
        this.brand = brand;
        this.colour = colour;
        this.name = name;
    }

    public void getInfo() {
        System.out.println("This car is " + this.brand + "'s " + this.name);
    }
}
