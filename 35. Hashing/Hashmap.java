import java.util.*;

public class Hashmap{
    public static void main(String args[]){

        //Create

        HashMap<String,Integer> hp = new HashMap<>();

        hp.put("one",1);
        hp.put("two",2);
        hp.put("three",3);
        hp.put("four",4);

        System.out.println(hp);

        //remove
        System.out.println(hp.remove("two"));

        hp.remove("four");
        System.out.println(hp);
        
        System.out.println(hp.remove("five"));

        //get
        int a = hp.get("one");
        System.out.println(a);

        //contains

        System.out.println(hp.containsKey("three"));
        System.out.println(hp.containsKey("five"));

        System.out.println(hp.size());
        
    }
}