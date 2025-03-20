public abstract class Animal {

    protected String name;

    public Animal(final String name) {
        this.name = name;
    }

    public abstract void walks();

    public void someFuntion() {
        walks();
        System.out.println("not a abstract method");
    }
}