public class UniquePath {

    public static int uniquePathDP(int rows, int cols) {

        int[][] dp = new int[rows + 1][cols + 1];
        for (int i = 0; i < rows; i++) {
            dp[i][0] = 1;
        }

        for (int j = 0; j < cols; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[rows - 1][cols - 1];
    }

    public static int uniquePathsRec(int rows, int cols) {
        if (rows == 0 || cols == 0) {
            return 0;
        }
        if (rows == 1 || cols == 1) {
            return 1;
        }

        return uniquePathsRec(rows - 1, cols) + uniquePathsRec(rows, cols - 1);
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsRec(3, 2));
    }

}
