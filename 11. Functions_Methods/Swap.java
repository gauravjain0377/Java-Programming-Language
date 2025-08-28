public class Swap {
    
    public static void swap(int a, int b) {
        
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        swap(a,b);
    }
    
    // public static void main(String[] args) {
    //     int a = 5;
    //     int b = 8;

    //     //swap
    //     int temp = a;
    //     a = b;
    //     b = temp;

    //     System.out.println("a = " + a);
    //     System.out.println("b = " + b);
    //     System.out.println(temp);
    // }
}
