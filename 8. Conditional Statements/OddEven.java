import java.util.*;

public class OddEven {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scn.nextInt();

        if(number % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }

    }
}