import java.util.*;

public class HollowRectanglePattern {
    public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
System.out.print("Enter rows: ");
        int rows = scn.nextInt();
        System.out.print("Enter cols: ");
        int cols = scn.nextInt();

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {

                if(i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}