public class SortColours {

    public static void sort(int[] nums) {

        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int move = start;
        while (move <= end) {

            if (nums[move] == 0) {
                swap(nums, start, move);
                start++;
                move++;
            } else if (nums[move] == 1) {
                move++;
            }

            else if (nums[move] == 2) {
                swap(nums, move, end);
                end--;
            }
        }
    }

    public static void swap(int[] nums, int indexA, int indexB) {
        int a = nums[indexA];
        nums[indexA] = nums[indexB];
        nums[indexB] = a;
    }

    public static void main(String[] args) {

        int[] array = { 2, 0, 1 };
        sort(array);
        for (int i : array) {
            System.out.println(i);
        }

    }
}
