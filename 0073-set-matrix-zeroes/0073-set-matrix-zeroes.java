public class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean row = false;
        boolean col = false;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                col = true;
                break;
            }
        }

        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                row = true;
                break;
            }
        }

        updateFirstRowAndColumn(matrix, n, m);

        updateMatrixRowsAndColumns(matrix, n, m);

        if (col) {
            cleanZeroCol(matrix, n);
        }

        if (row) {
            cleanZeroRow(matrix, m);
        }
    }

    private void updateFirstRowAndColumn(int[][] matrix, int n, int m) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
    }

    private void updateMatrixRowsAndColumns(int[][] matrix, int n, int m) {
        for (int i = 1; i < n; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < m; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < m; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void cleanZeroCol(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            matrix[i][0] = 0;
        }
    }

    private void cleanZeroRow(int[][] matrix, int m) {
        for (int j = 0; j < m; j++) {
            matrix[0][j] = 0;
        }
    }
}
