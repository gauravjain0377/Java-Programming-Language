// Diameter of a Tree
/*  Explanation from the notes
                1 
               /  \ 
              2    3
             / \   / \
             4  5  6  7

*/

public class Diameter {
        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        public static int height(Node root) {   // O(n^2)
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);    // lh = left height 
        int rh = height(root.right);   // rh = right height

        return Math.max(lh, rh) + 1;
    }

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDiameter = diameter(root.left);
            int leftht = height(root.left);
            int rightDiameter = diameter(root.right);
            int rightht = height(root.right);

            int selfDiameter = leftht + rightht + 1;

            return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
        }

        public static void main(String[] args) {

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            System.out.println(diameter(root));
        }
    }