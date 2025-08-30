import java.util.*;


public class HollowRectangle {

    public static void hollowRectangle(int rows, int cols) {
        
        
            for(int i=1; i<=rows; i++) {      // outer loop
                
            for(int j=1; j<=cols; j++) {     // inner loop - columns
                if(i == 1 || i == rows || j == 1 || j == cols) {       // boundary condition for the rectangle
                    System.out.print("*");
                }
                else {     // for the inner part of the rectangle
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scn.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scn.nextInt();
        hollowRectangle(rows, cols);

        scn.close();
    }

}