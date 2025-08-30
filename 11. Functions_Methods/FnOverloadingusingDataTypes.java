public class FnOverloadingusingDataTypes {

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static float Sum(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(Sum(5,3));
        System.out.println(Sum(5.3f,3.7f));
        
    }
}
