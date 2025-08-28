import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter to what number the star should be print: ");
        int n = scn.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        scn.close();
    }
}
