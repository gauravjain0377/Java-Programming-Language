import java.util.*;

public class Fibonacci {

    public static void isFibonacci(int n) {

        int first = 0;
        int second = 1;

        if (n >= 1)
            System.out.print(first + " ");

        if (n >= 2)
            System.out.print(second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }


//     public static int fibonacci(int n) {

//     if (n == 0)
//         return 0;

//     if (n == 1)
//         return 1;

//     int first = 0;
//     int second = 1;

//     for (int i = 2; i <= n; i++) {
//         int next = first + second;
//         first = second;
//         second = next;
//     }

//     return second;
// }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        isFibonacci(n);

        sc.close();
    }
}