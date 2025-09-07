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

public class FlattenBinaryTreeToLinkedListOptimized {
    private static Node prev = null;

    public static void flattenBT(Node root){
        if(root == null) return;

        flattenBT(root.right);
        flattenBT(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

    
    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(30);
        root.right.right = new Node(40);

        flattenBT(root);
    }
}
