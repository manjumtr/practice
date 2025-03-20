public class MajorityElementNby2 {

    public static int majority1(int[] arr) {
        int n = arr.length;
        int element = 8376748;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                count += (arr[i] == arr[j]) ? 1 : 0;
            }
            if ((n / 2) < count) {
                element = arr[i];
            }

        }
        return element;
    }

    public static int majority2(int[] arr) {

        int count = 0;
        int element = 4567;
        for (int i : arr) {
            if (count == 0) {
                element = i;
            }
            count += element == 1 ? 1 : -1;
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 2, 1, 2, 2, 2 };
        System.out.println(majority2(arr));
    }

}
