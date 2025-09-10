
public class Question3 {

    public static int[][] transpose(int matrix[][]) {
        int n = matrix.length;       // number of rows
        int m = matrix[0].length;    // number of columns

        int[][] transposed = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = matrix[i][j]; // swap row and column
            }
        }

        return transposed;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {11, 12, 13},
            {21, 22, 23}
        };

        int[][] result = transpose(matrix);

        // Print the transposed matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
