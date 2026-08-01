import java.util.*;

public class Example {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int n = scn.nextInt();
        for(int i=0; i<n; i++) {
            list.add(scn.next());
        }

        LinkedList<String> reverse = new LinkedList<>(list);
        Collections.reverse(reverse);

        if(list.equals(reverse)) {
            System.out.print("palindrome");
        } else {
            System.out.print("Not");
        }




        
    }
}
