import java.util.*;

public class ClearIthBit {

    public static void clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        int newNumber = n & bitMask; 
        System.out.println(newNumber);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();

        System.out.print("Enter the bit position: ");
        int i = scn.nextInt();

        clearIthBit(n, i);



        scn.close(); 
    }
}
