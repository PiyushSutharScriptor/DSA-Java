import java.util.*;

class Node{
    Node left;
    Node right;
    int data;

    Node(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

public class MaximumDepthOfBTOpti {

    public static int findMax(Node root){
        if(root==null) return 0;
        
        int lh = findMax(root.left);
        int rh = findMax(root.right);

        return 1+Math.max(lh,rh);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int res = findMax(root);
        System.out.println(res);
    }
}
