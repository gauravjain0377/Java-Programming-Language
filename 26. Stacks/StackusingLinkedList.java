import java.util.*;

public class StackusingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stacks {
        static Node head = null;
        public static boolean isEmpty() {
            return head ==  null;
        }

        // Push
        public static void push(int data) {
            list.add(data);
        }

        // POP
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
           return list.get(list.size() - 1);

        }
    }
     public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }
}

