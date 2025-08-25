import java.util.*;

public class SumofnNaturalNumber {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
       
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum = sum + i; // sum += i;
            i++;
        }
        System.out.println("The Sum of natural number are: " + sum);

        scn.close();
    }
}
