public class Lambdas {

    public static void someFunction() {
        MetroEngine de = () -> System.out.println("driver engine starts");

        MetroEngine dle = () -> System.out.println("driver less engine starts");

        MetroEngine me = new MetroEngine() {

            @Override
            public void start() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'start'");
            }

        };

        de.start();
        dle.start();
        System.out.println(de.hashCode());
    }

    @FunctionalInterface
    public interface MetroEngine {

        void start();
    }

}
