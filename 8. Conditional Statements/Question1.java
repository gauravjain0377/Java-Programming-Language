import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        if(number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
       
        
    }
}