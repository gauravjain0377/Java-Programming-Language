// Given a route containing 4 directions (E, W, N, S), 
// find the shortest path to reach destination.

public class ShortestPath {

    public static float shortestPath(String path) {
        int x = 0;
        int y = 0;

        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);   // dir = direction 
            
            // North
            if(dir == 'N') {
                y++;
            } 
            
            // South
            else if(dir == 'S') {
                y--;
            } 
            
            // East
            else if(dir == 'E') {
                x++;
            } 
            
            // West
            else {
                x--;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

       return (float)Math.sqrt(X2 +Y2);
       
    }
    public static void main(String[] args) {
        String path = "WNSSNNNSENNN";
        // String path = "NS";
        System.out.println(shortestPath(path));
    }
}
  




// import java.util.*;

// public class Main {

//     public static float shortestPath(String path) {

//         int x1 = 0;
//         int y1 = 0;

//         int x2 = 0;
//         int y2 = 0;

//         for(int i = 0; i < path.length(); i++) {

//             char dir = path.charAt(i);

//             if(dir == 'N') {
//                 y2++;
//             }
//             else if(dir == 'S') {
//                 y2--;
//             }
//             else if(dir == 'E') {
//                 x2++;
//             }
//             else if(dir == 'W') {
//                 x2--;
//             }
//         }

//         int X2 = (x2 - x1) * (x2 - x1);
//         int Y2 = (y2 - y1) * (y2 - y1);

//         return (float)Math.sqrt(X2 + Y2);
//     }

//     public static void main(String[] args) {

//         Scanner scn = new Scanner(System.in);

//         System.out.print("Enter path: ");
//         String path = scn.nextLine();

//         System.out.println("Shortest Distance = " + shortestPath(path));

//         scn.close();
//     }
// }