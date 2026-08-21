// Remove Nth Node (by Index)

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveNthNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();

        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("LinkedList = " + list);
        } else {
            System.out.println("Invalid Index");
        }

        sc.close();
    }
}





// Remove Nth Node from the End

/* 

import java.util.*;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter n (from end): ");
        int k = sc.nextInt();

        if (k > 0 && k <= list.size()) {
            list.remove(list.size() - k);
            System.out.println("LinkedList = " + list);
        } else {
            System.out.println("Invalid Value");
        }

        sc.close();
    }
}
    

*/