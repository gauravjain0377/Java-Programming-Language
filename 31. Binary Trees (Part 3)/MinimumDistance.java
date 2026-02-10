/* Minimum Distance between the nodes
Explanation from the notes. 
*/

public class MinimumDistance {
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

  public static Node lca(Node root, int n1, int n2) {    //O(n), lca = Lowest Common Ancestor
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        // leftLCA = valid value, rightLCA = null
        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }

        return root;
    }

    public static int lcaDistance(Node root, int n) {
        if(root == null) {
            return -1;
        }

        if(root.data == n) {
            return 0;
        }

        int leftDistance = lcaDistance(root.left, n);
        int rightDistance = lcaDistance(root.right, n);

        if(leftDistance == -1 && rightDistance == -1) {
            return -1;
        } else if(leftDistance == -1) {
            return rightDistance + 1;
         } else {
            return leftDistance + 1;
         }
    }

  public static int minDistance(Node root, int n1, int n2) {
    Node lca2 = lca(root, n1, n2);
    int dist1 = lcaDistance(root, n1);
    int dist2 = lcaDistance(lca2, n2);

    return dist1 + dist2;
  }
    public static void main(String[] args) {
        /*
     *            1
     *           / \
     *          2   3
     *         / \  / \
     *         4 5  6 7
     */
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    int n1=4, n2=6;

    System.out.println(minDistance(root, n1, n2));
    }
}
