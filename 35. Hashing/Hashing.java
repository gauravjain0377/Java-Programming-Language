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

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population);
    }
}