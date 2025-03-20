public class KadaneAlgo {
    public static int kadane(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > result) {
                result = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] mixedArray = {
                14, 0, -3, 25, -37, 49, -50, 38, -16, 9, 0, 28, -21, 13, -8, 34, 27, 0, -12, 45,
                61, -5, 0, 32, 18, -31, 47, -22, 19, 10, 0, 33, -40, 52, -48, 20, 7, 0, -23, 36,
                15, -6, 0, 43, -10, 59, -29, 11, 8, 0, 26, -41, 39, -25, 22, 12, 0, -17, 35, 13,
                -4, 0, 31, -46, 58, -19, 21, 6, 0, 29, -38, 44, -28, 16, 3, 0, -36, 46, 17, -7,
                0, 24, -13, 57, -9, 24, 5, 0, 30, -35, 50, -33, 18, 4, 0, -26, 37, 15, -14, 0,
                27, -24, 54, -12, 23, 2, 0, -39, 42, 12, -11, 0, 37, -18, 53, -29, 3, 1, 0, 35,
                -30, 47, -14, 25, 5, 0, -28, 41, 13, -6, 0, 45, -1, 51, -23, 12, 4, 0, -31, 44,
                10, -21
        };
        System.out.println(kadane(mixedArray));
    }
}
