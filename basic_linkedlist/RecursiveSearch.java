import java.util.*;

public class RecursiveSearch {

    public static int search(LinkedList<Integer> list, int key, int index) {
        if (index == list.size()) {
            return -1;
        }

        if (list.get(index) == key) {
            return index;
        }

        return search(list, key, index + 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int key = scn.nextInt();

        System.out.println(search(list, key, 0));
    }
}