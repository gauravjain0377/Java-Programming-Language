import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
System.out.print("Enter Side: ");
        int side = scn.nextInt();
        int area = side * side;
        System.out.println("The area of the square is: " + area);
    }
}
