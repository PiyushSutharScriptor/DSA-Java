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

public class IterativePostOrderUsingTwoStacks {

    public static void postOrderIter(Node root , List<Integer> li){
        Stack <Node> st1 = new Stack<>();
        Stack <Node> st2 = new Stack<>();

        Node node = root;

        st1.add(node);

        while(!st1.isEmpty()){
            node = st1.pop();
            st2.add(node);

            if(node.left!=null){
                st1.add(node.left);
            }

            if(node.right!=null){
                st1.add(node.right);
            }

        }

        while(!st2.isEmpty()){
            li.add(st2.pop().data);
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

        postOrderIter(root, li);

        System.out.println(li);
    }
}
