public class MatrixSearch {

    public static boolean isPresent(int[] arr, int target) {

        int high = arr.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static boolean matrixSearch(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] <= target && matrix[i][cols - 1] >= target) {
                return isPresent(matrix[i], target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(matrixSearch(matrix, 13));
    }
}
