// Armstrong Number (Only for 3-digit numbers)
// below second code also view.

import java.util.*;

public class Armstrong {

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return temp == sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isArmstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

        sc.close();
    }
}




// Armstrong Number (Works for Any Number of Digits)
// import java.util.*;

// public class Main {

//     public static int countDigits(int n) {
//         int count = 0;

//         while (n != 0) {
//             count++;
//             n /= 10;
//         }

//         return count;
//     }

//     public static boolean isArmstrong(int n) {

//         int temp = n;
//         int digits = countDigits(n);
//         int sum = 0;

//         while (n != 0) {

//             int digit = n % 10;
//             sum += (int) Math.pow(digit, digits);
//             n /= 10;
//         }

//         return temp == sum;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         if (isArmstrong(n))
//             System.out.println("Armstrong");
//         else
//             System.out.println("Not Armstrong");

//         sc.close();
//     }
// }