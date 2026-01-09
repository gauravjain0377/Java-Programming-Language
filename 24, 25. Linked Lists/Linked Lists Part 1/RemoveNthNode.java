// Find & Remove Nth node from End
// Iterative Approach

public class RemoveNthNode {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // step 1. Create New Node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;    
        }

        // step2. newNode next = head
        newNode.next = head; // Link

        // step 3. head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {   // O(n)
        // base case
        if(head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < index-1) {
            temp = temp.next;
            i++;
        }

        // i = index-1; temp -> previous
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int size = 0;
        Node temp = head;

        while(temp != null) {
            temp = temp.next;
            size++;
        }
        if(n == size) {
            head = head.next;   // remove First
            return;
        }

        // size - n
        int i = 1;
        int indexToFind = size - n;
        Node prev = head;
        while(i < indexToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

   
    public static void main(String[] args) {
        RemoveNthNode ll = new RemoveNthNode ();   // ll = linked list
     
        ll.addFirst(2);
        ll.addFirst(8);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);

        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();

  
    }
}


