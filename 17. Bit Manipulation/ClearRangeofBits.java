import java.util.*;

public class ClearRangeofBits {

    public static void clearRangeofBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << (i)) - 1;
        int bitMask = a | b;
        int newNumber = n & bitMask;
        System.out.println(newNumber);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        System.out.print("Enter the starting bit position: ");
        int i = scn.nextInt();
        System.out.print("Enter the last bit position: ");
        int j = scn.nextInt();
        clearRangeofBits(n, i, j);

        scn.close();
    }
}
