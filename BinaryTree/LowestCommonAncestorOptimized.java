import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data1) {
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

public class LowestCommonAncestorOptimized {

    public static Node findLCA(Node root, int a, int b) {
        if (root == null) return null;

        if (root.data == a || root.data == b) {
            return root;
        }

        Node left = findLCA(root.left, a, b);
        Node right = findLCA(root.right, a, b);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        int a = 5;
        int b = 6;

        Node ans = findLCA(root, a, b);
        System.out.println(ans.data);
    }
}
