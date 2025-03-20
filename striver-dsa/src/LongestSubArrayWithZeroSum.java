import java.util.*;

public class LongestSubArrayWithZeroSum {

    public static int zeroSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (map.get(sum) != null) {
                    max = Math.max(max, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 9, -3, 3, -1, 6, -5 };
        System.out.println(zeroSum(nums));
    }

}
