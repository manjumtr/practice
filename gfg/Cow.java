public class Cow extends Animal {

    private boolean isCornivorous;

    public Cow(String name) {
        super(name);
        this.isCornivorous = false;
    }

    public void walks() {
        System.out.println(this.name + " walks...!");
    }

}
