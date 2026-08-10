import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        // Create 
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);  

        System.out.println(hm);

        // remove
        hm.remove("US");
        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        // containsKey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Russia"));

        // Size
        System.out.println(hm.size());

        // clear - to empty the map completely
        hm.clear();
        
        // is empty
        System.out.print(hm.isEmpty());

        
       
    }
}   