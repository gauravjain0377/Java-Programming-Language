import java.util.*;

public class RemoveDuplicatesfromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1)
                result += ch;
        }
        System.out.println(result);
    }
}



// import java.util.*;

// public class Main {

//     public static String removeDuplicates(String str) {

//         str = str.toLowerCase();

//         boolean[] visited = new boolean[26];
//         String result = "";

//         for (int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if (!visited[ch - 'a']) {
//                 visited[ch - 'a'] = true;
//                 result += ch;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         System.out.println(removeDuplicates(str));

//         sc.close();
//     }
// }