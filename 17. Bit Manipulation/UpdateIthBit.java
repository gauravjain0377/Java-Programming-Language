import java.util.Scanner;

public class UpdateIthBit {

    // Clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Set ith bit
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Update ith bit
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = scn.nextInt();

        System.out.print("Enter the bit position: ");
        int i = scn.nextInt();

        System.out.print("Enter the new bit (0 or 1): ");
        int newBit = scn.nextInt();

        int result = updateIthBit(n, i, newBit);

        System.out.println("Updated Number: " + result);

        scn.close();
    }
}
