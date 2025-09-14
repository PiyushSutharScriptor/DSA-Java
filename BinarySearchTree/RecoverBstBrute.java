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

public class RecoverBstBrute {

    private static int i=0;

    public static void recover(Node root){
        List<Integer> li = new ArrayList<>();
        inorder(root, li);

        Collections.sort(li);

        update(root, li);
    }

    public static void inorder(Node root, List<Integer> li){
        if(root==null) return;

        inorder(root.left, li);
        li.add(root.data);
        inorder(root.right, li);
    }

    public static void update(Node root, List<Integer> li){
        if(root==null) return;

        update(root.left, li);
        root.data = li.get(i++);
        update(root.right, li);
    }
    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(70);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(20);
        
        recover(root);
    }
}
