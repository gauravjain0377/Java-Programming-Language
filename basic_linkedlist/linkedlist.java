import java.util.*;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addFirst(5);
        ll.addFirst(7);
        System.out.print(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.print(ll);
    }
}
