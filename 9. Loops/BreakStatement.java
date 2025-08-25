public class BreakStatement {
    public static void main(String[] args) {
        
        for(int i = 1; i<=10; i++) {
            if(i == 6) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop");



        // for( int i = 1; i<=5; i++) {
        //     System.out.println(i);
        //     if(i > 3) {
        //         break;
        //     }
        // }
        // System.out.println("Out of the loop");
    }
}
