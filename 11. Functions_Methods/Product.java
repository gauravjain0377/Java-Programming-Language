// public class Product {

//     public static int product(int a, int b) {
//         int product = a * b;
//         return product;
//     }
//     public static void main(String[] args) {
      
//        int prod = product(10, 20);
//         System.out.println("Product of a and b is: " + prod) ;
//     }
// }


public class Product {

    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }


    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int prod = product(a,b);
        System.out.println("The Product is: " + prod);
    
    }
}