import java.util.*;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix, int r, int c) {

        int[][] trans = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter Matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] trans = transpose(matrix, r, c);

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
