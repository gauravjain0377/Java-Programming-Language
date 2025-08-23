public class Switch {
    public static void main(String[] args) {
        int number = 1;
        switch(number) {
            case 1 : System.out.println("Samosa");
            break;
            case 2 : System.out.println("Burger");
            break;
            case 3 : System.out.println("Pizza");
            break;
            default: System.out.println("Item not found");
        }
    }
}