import java.util.*;

public class SetIthBit {
  
    public static void setIthBit(int n, int i) {
        int bitMask = 1 << i;
        int newNumber = n | bitMask; 
        System.out.println(newNumber);
    }
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        System.out.print("Enter the bit position: ");
        int i = scn.nextInt();

        setIthBit(n, i);

        scn.close();
    }
}