public class AddMiddle {

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

    public void addFirst(int data) {

        // step 1. Create New Node
        Node newNode = new Node(data);

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


    // Add in the middle -> add(index, data)
    public void add(int index, int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
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

    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle ();   // ll = linked list
     
        ll.addFirst(2);
        ll.addFirst(8);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
    }
}




