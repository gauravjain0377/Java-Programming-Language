import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // String input = scn.next();
        // System.out.println("You entered: " + input);

        // String name = scn.nextLine();
        // System.out.println("Your name is: " + name);

        // int number = scn.nextInt();
        // System.out.println("You entered: " + number);

        // byte number = scn.nextByte();
        // System.out.println("You entered: " + number);

        System.out.print("Enter a float number:");
        float number = scn.nextFloat();
        System.out.println("You entered: " + number);
    }
}
