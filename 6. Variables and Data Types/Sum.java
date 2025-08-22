import java.util.*;

public class Sum {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int number = scn.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = scn.nextInt();
        int sum = number + number2;
        System.out.println("The sum is: " + sum);
    }
}
