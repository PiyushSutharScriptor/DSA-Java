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

public class InorderSuccessorInBstBrute {
    public static Node myFun(Node root, int k){
        if(root==null) return null;

        Node left = myFun(root.left, k);
        if(left!=null) return left;

        if(root.data>k) return root;

        return myFun(root.right, k);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        int k = 20;

        Node ans = myFun(root,k);
        System.out.println(ans.data);
    }
}

