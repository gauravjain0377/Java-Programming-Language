// print nth fibonacci number

public class Fibonaaci {

    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int f1 = fibonacci(n - 1);
        int f2 = fibonacci(n - 2);
        int fn = fibonacci(n - 1) + fibonacci(n - 2);
        return fn;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));
    }
}
