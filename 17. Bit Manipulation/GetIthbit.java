import java.util.*;

public class GetIthbit {

    public static void getIthBit(int n, int i) {
        int bitMask = 1 << i;   // Shift 1 left by i positions
        if ((n & bitMask) == 0) {
            System.out.println(0);   // i-th bit is 0
        } else {
            System.out.println(1);   // i-th bit is 1
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        System.out.print("Enter the bit position: ");
        int i = scn.nextInt();

        getIthBit(n, i);

        scn.close();
    }
}
