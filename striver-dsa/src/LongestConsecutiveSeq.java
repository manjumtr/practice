import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {

    public static int longestConsecutiveSeq(int[] nums) {

        Set<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            numSet.add(i);
        }

        int longest = 0;
        for (int i : numSet) {
            int current = 0;
            if (!numSet.contains(i - 1)) {
                current = 1;

                while (numSet.contains(i + 1)) {
                    current++;
                    i++;
                }

                longest = Math.max(current, longest);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutiveSeq(nums));

    }

}
