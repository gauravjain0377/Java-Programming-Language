// Maximum Subarray Sum problem, known as Kadane's Algorithm.

import java.util.*;

public class Kadane_Algorithm {

    public static int kadane(int numbers[]) {
        int cs = numbers[0];
        int ms = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            cs = Math.max(numbers[i], cs + numbers[i]);
            ms = Math.max(ms, cs);
        }

        return ms;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scn.nextInt();
        }

        System.out.println(kadane(numbers));
    }
}