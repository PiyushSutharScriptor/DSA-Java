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

public class DfsPostOrderTraversal {
    public static void post(Node root, List<Integer> li){
        if(root==null){
            return;
        }
        li.add(root.data);
        post(root.left , li);
        post(root.right , li);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        List<Integer> li = new ArrayList<>();
        post(root, li);

        System.out.println(li);
    }

}
