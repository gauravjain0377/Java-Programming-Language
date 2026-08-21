// Maximum Subarray Sum + Print the Subarray
// Print subarray with maximum subarray sum (extended version of kadane problem)

import java.util.*;

public class Kadane_Extended {

    public static void kadane(int numbers[]) {

        int cs = numbers[0];
        int ms = numbers[0];

        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > cs + numbers[i]) {
                cs = numbers[i];
                start = i;
            } else {
                cs = cs + numbers[i];
            }

            if (cs > ms) {
                ms = cs;
                bestStart = start;
                bestEnd = i;
            }
        }

        System.out.println("Maximum Sum = " + ms);

        System.out.print("Subarray = ");

        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scn.nextInt();
        }

        kadane(numbers);

        scn.close();
    }
}