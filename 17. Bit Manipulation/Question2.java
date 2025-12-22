public class Question2 {
    public static void main(String[] args) {
        int x = 5, y = 8;

       System.out.println("Before swap: x = " + x + " and y = " + y);     //swap using xor
          x = x ^ y;
          y = x ^ y;
          x = x ^ y;
        
          System.out.println("After swap: x = " + x + " and y = " + y);
    
        }
   
    }
   

