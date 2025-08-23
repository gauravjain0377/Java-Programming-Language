import java.util.*;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three Numbers: ");
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int number3 = scn.nextInt();

      if( (number1 >= number2) && (number1 >= number3) ) {
        System.out.println("A is largest");
      }
      else if( (number2 >= number1) && (number2 >= number3) ) {
        System.out.println("B is largest");
      }
      else {
        System.out.println("C is largest");
      }
    }
}