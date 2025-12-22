public class Question4 {
    public static void main(String[] args) {

        // Using bitwise OR
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ') + " ");
        }

        System.out.println();
        System.out.println();

        // Using built-in method
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(Character.toLowerCase(ch) + " ");
        }
    }
}
