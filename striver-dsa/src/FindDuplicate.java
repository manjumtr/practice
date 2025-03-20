public class FindDuplicate {

    public static int duplicate(int[] arr) {

        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        fast = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 3 };
        System.out.println(duplicate(arr));
    }
}
