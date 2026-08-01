import java.util.LinkedList;
import java.util.Scanner;

public class DynamicLinkedList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }

        System.out.println("LinkedList = " + list);

        scn.close();
    }
}