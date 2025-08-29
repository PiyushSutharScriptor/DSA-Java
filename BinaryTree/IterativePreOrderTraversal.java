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

public class IterativePreOrderTraversal {

    public static void preOrderIter(Node root, List<Integer> li){
        Stack<Node> st = new Stack<>();

        if(root==null) return;
        st.add(root);

        while(!st.isEmpty()){
            Node el = st.pop();
            li.add(el.data);

            if(el.right!=null){
                st.add(el.right);
            }

            if(el.left!=null){
                st.add(el.left);
            }
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

        preOrderIter(root, li);

        System.out.println(li);
    }
}
