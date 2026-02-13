import java.util.ArrayList;

public class InsertMaxHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {   // O(logn)
            // add at last index
            arr.add(data);

            int x = arr.size() - 1;  // x is child index
            int parent = (x - 1) / 2;  // parent index 

            while(arr.get(x) > arr.get(parent)) {   // O(logn)
                // swap 
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int maxIdx = i;

            if(left < arr.size() && arr.get(maxIdx) < arr.get(left)) {
                maxIdx = left;
            }

            if(right < arr.size() && arr.get(maxIdx) < arr.get(right)) {
                maxIdx = right;
            }

            if(maxIdx != i) {
                // swap 
                int temp = arr.get(i);
                arr.set(i, arr.get(maxIdx));
                arr.set(maxIdx, temp);

                heapify(maxIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // step 1 - swap first and last 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step 2 - delete last 
            arr.remove(arr.size() - 1);

            // step 3 - heapify (fix my heap)
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

        // Heap pq = new Heap();
        // pq.add(3);
        // pq.add(4);
        // pq.add(1);
        // pq.add(5);

        // while(!pq.isEmpty()) {   // heap sort
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }
    }
}
