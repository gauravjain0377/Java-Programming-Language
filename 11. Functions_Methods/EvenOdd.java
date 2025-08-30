import java.util.*;

public class EvenOdd {

    public static boolean isEven(int number) {
       if(number % 2 == 0) {    // if the number is divisible by 2 then it is a even number
        return true;
       }else {
        return false;
       }
       
       
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scn.nextInt();

        if(isEven(number)) {
            System.out.println("It is a Even Number");
        }else {
            System.out.println("It is a odd Number");
        }
      scn.close();
        
    }
}