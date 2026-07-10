import java.util.*;
public class MatrixAddition {
    public static int[][] addMatrix(int[][] a, int[][] b, int row, int col) {

        int[][] sum = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];

        System.out.println("Enter First Matrix:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int[][] ans = addMatrix(a, b, row, col);

        System.out.println("Sum Matrix:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
