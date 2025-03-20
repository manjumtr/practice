public class StaticExample {

    public String name = "manju";
    public static int age = 23;

    public static void staticMethod() {
        // System.out.println(name);
        System.out.println(age);
    }

    public void nonStaticMethod() {
        System.out.println(name);
        System.out.println(age);
    }

}
