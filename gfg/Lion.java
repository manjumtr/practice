public class Lion extends Animal {

    private boolean isCornivorous;

    public Lion(String name) {
        super(name);
        this.isCornivorous = true;
    }

    @Override
    public void walks() {
        System.out.println(this.name + " Walks");
    }
}
