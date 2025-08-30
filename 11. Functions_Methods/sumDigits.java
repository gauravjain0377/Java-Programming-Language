import java.util.*;

public class sumDigits {
    
    public static int SumofDigits(int n) {
        int sum = 0;
       while(n > 0) {
        int lastDigit = n % 10;
        sum += lastDigit;
        n /= 10;
       }
       return sum;
       }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        System.out.println("The Sum of the digits of " + n + " is: " + SumofDigits(n));
        scn.close();
    }
}