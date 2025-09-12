// See explanation in copy - page - 168  

import java.util.*;

public class CountSetBits {

    public static void countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {  // checked our least significant bit.
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        countSetBits(n);
        
        scn.close();
    }
}
