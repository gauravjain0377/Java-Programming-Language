import java.util.*;

public class QueueusingJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();  // We can write LinkedList or ArrayDeque
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}