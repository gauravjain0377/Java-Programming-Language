import java.util.*;

public class IncometaxCalculator {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your income in lakhs: ");
       double income = scn.nextDouble();
       double tax = 0;

       if(income < 500000) {
        tax = 0;
       }
       else if(income >= 500000 && income < 1000000) {
        tax = 0.20 * income;
       }
       else if(income >= 1000000) {
        tax = 0.30 * income;
       }
       System.out.println("You have to pay " + tax + " as tax");


    }
}