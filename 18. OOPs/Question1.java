// z = a + bi
// z = a + bi, where 'a' is the real part, 'b' is the imaginary part, and i is the imaginary unit (\(i^{2}=-1\))
// Example: \(z=2+3i\) Real Part: 2Imaginary Part: 3 

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        int a = sc.nextInt();

        System.out.print("Enter imaginary part of first complex number: ");
        int b = sc.nextInt();

        System.out.print("Enter real part of second complex number: ");
        int c = sc.nextInt();

        System.out.print("Enter imaginary part of second complex number: ");
        int d = sc.nextInt();

        Complex obj = new Complex();

        obj.sum(a, b, c, d);
        obj.difference(a, b, c, d);
        obj.product(a, b, c, d);
    }
}

class Complex {

    void sum(int a, int b, int c, int d) {
        System.out.println("Sum = " + (a + c) + " + " + (b + d) + "i");
    }

    void difference(int a, int b, int c, int d) {
        System.out.println("Difference = " + (a - c) + " + " + (b - d) + "i");
    }

    void product(int a, int b, int c, int d) {
        int real = (a * c) - (b * d);
        int imag = (a * d) + (b * c);
        System.out.println("Product = " + real + " + " + imag + "i");
    }
}
