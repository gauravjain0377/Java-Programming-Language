public class LinearSearching {
    
    public static int Menu(String menu[], String key) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    String menu[] = {"Dosa", "Pav Bhaji", "Kachori", "Pani Puri", "Dal" };
        String key = "Pav Bhaji";
        
     int index = Menu(menu, key);
     if(index == -1) {
         System.out.println("Not Found the menu dish");
     } else {
         System.out.println("Found at index: " + index);
     }
        
    }
}