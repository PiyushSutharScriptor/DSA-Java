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

public class DfsInOrderTraversal {
    public static void in(Node root, List<Integer> li){
        if(root==null){
            return;
        }
        in(root.left , li);
        li.add(root.data);
        in(root.right , li);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        List<Integer> li = new ArrayList<>();
        in(root, li);

        System.out.println(li);
    }
}
