import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data1) {
        this.data = data1;
        this.left = this.right = null;
    }
}

public class TopViewOfBinaryTreeSomeTestFails {

    public static void topView(Node root, List<Integer> li){
        Node temp = root.left;
        
        while(temp!=null){
            li.add(temp.data);
            temp = temp.left;
        }

        Collections.reverse(li);
        li.add(root.data);

        temp = root.right;
        while(temp!=null){
            li.add(temp.data);
            temp = temp.right;
        }
        
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.left.left.left = new Node(9);

        List<Integer> li = new ArrayList<>();

        topView(root, li);

        System.out.println(li);
    }
}
