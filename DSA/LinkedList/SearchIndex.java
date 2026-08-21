import java.util.*;

public class SearchIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int key = scn.nextInt();

        int index = list.indexOf(key);

        if (index != -1) {
            System.out.println("Element Found at Index = " + index);
        } else {
            System.out.println("Element Not Found");
        }
    }
}



















// import java.util.*;

// public class SearchElement {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<>();

//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);

//         int key = scn.nextInt();

//         if (list.contains(key)) {
//             System.out.println("Element Found");
//         } else {
//             System.out.println("Element Not Found");
//         }
//     }
// }
