// keet entering numbers till user enters a multiple of 10

import java.util.*;

public class Break {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            int n = scn.nextInt();
            if( n % 10 == 0) {
                System.out.println("Thankyou, " + n + " is a multiple of 10");
                break;
            }
            
        }
        while(true);
        
        
    }
}
