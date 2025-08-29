import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

public class IterativeInOrderTraversal {

    public static void inOrderIter(Node root, List<Integer> li){
        Stack<Node> st = new Stack<>();

        Node node = root;

        while(node!=null || !st.isEmpty()){

            while(node!=null){
                st.push(node);
                node = node.left;
            }

            node = st.pop();
            li.add(node.data);

            node = node.right;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        List<Integer> li = new ArrayList<>();

        inOrderIter(root, li);

        System.out.println(li);
    }
}
