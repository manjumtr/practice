import java.util.function.Predicate;

public class PredicateEg {
    public static void someFunction() {
        Predicate<Integer> ans = (x) -> x < 10;
        char a = 'a';
        System.out.println(ans.test(9));
    }
}
