public class MatrixZeros {

    public static void setZeros(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] zeroRows = new int[rows];
        int[] zeroColumns = new int[columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = 1;
                    zeroColumns[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (zeroRows[i] == 1 || zeroColumns[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 0, 3, 5 },
                { 4, 5, 0, 3 },
                { 7, 8, 9, 0 }
        };
        setZeros(matrix);
    }
}
