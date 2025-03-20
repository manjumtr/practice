import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                result[0] = map.get(arr[i]);
                result[1] = i;
                return result;

            } else {
                map.put(target - arr[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4 };
        System.out.println(twoSum(arr, 6)[0]);
        System.out.println(twoSum(arr, 6)[1]);

    }

}
