package designpatterns.StateDesignPattern;

public class Product {
    public String name;
    public Integer id;
    public Integer price;

    public Product(int id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
