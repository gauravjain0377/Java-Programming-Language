import java.util.*;

public class examplesss {
  
  

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n = scn.nextInt();
        if((n % 4 == 0  && n % 100 != 0) || (n % 400 == 0)) {
        System.out.print("It is a leap year");
    } else {
         System.out.print("It is a not a leap year");
    }



   

        scn.close();
    }
}
