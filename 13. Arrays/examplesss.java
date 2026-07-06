import java.util.*;

public class examplesss {
    public static int kadanes(int numbers[]) {
       int cs = 0;
       int ms = Integer.MIN_VALUE;

       for(int i=0; i<numbers.length; i++) {
        cs = cs + numbers[i];
        if(cs < 0) {
            cs = 0;
        }
        ms = Math.max(ms, cs);
       }
       return ms;
        
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scn.nextInt();

        int[] numbers = new int[size];

        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<size; i++) {
            numbers[i] = scn.nextInt();
        }

      System.out.print("Kadanes answer is: " + kadanes(numbers));

    }
}
