import java.util.*;

public class HollowRechtanglePattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.println("*");
            }

        }
        scn.close();
    }
} 
