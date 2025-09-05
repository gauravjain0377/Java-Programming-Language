import java.util.*;

public class TwoDArrayCreation {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner scn = new Scanner(System.in);

        // input
        for(int i = 0; i < n; i++) {
            System.out.print("Enter row " + (i+1) + " (" + m + " numbers): ");
            for(int j = 0; j < m; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        // output
        System.out.println("\nMatrix is:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
