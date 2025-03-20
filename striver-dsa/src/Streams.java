import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);

    }

}
