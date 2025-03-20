public class Generics<T, K> {

    T t;
    K k;

    public Generics(final T t, final K k) {
        this.t = t;
        this.k = k;
    }

    public <A, B> void someFunction(A t, B k) {
        System.out.println(t);
        System.out.println(k);

    }

    public static <A, B> void some(A a, B b) {
        System.out.println(a);
    }

}