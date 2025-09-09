// Given a route containing 4 directions (E, W, N, S), 
// find the shortest path to reach destination.

public class ShortestPath {

    public static float shortestPath(String path) {
        int x = 0;
        int y = 0;

        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            
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
        System.out.println(shortestPath(path));
    }
}
  