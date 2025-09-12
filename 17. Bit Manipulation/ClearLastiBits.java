import java.util.*;

public class ClearLastiBits {

    public static void clearLastIBits(int n, int i) {
        int bitMask = (~0) << i;
        // int bitMask = -1 << i;
        int newNumber = n & bitMask;
        System.out.println(newNumber);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        System.out.print("Enter the bit position: ");
        int i = scn.nextInt();
        clearLastIBits(n, i);
    }
}
