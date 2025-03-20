import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void execute() {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squares = integers.stream().map(val -> val * val).toList();
        List<Integer> mul5or7 = integers.stream().filter(el -> el % 5 == 0 || el % 7 == 0).toList();
        System.out.println(mul5or7);
    }

}
