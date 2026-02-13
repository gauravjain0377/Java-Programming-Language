
import java.util.PriorityQueue;

/* Nearby Cars 
 Question and Explanation from notes */

public class NearbyCars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distanceSquare;
        int index;

        public Point(int x, int y, int distanceSquare, int index) {
            this.x = x;
            this.y = y;
            this.distanceSquare = distanceSquare;
            this.index = index;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distanceSquare - p2.distanceSquare;
        }
    }
    public static void main(String[] args) {
            int points[][] = {{3, 3}, {5, -1}, {-2, 4}};
            int k = 2;

            PriorityQueue<Point> pq = new PriorityQueue<>();
            for(int i=0; i<points.length; i++) {
                int distanceSquare = points[i][0]*points[i][0] + points[i][1]*points[i][1];
                pq.add(new Point(points[i][0], points[i][1], distanceSquare, i));
            }

            // nearest K cars 
            for(int i=0; i<k; i++) {
                System.out.println("C" + pq.remove().index);
            }
    }
}
