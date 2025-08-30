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

public class IterativePostOrderUsingOneStacks {

    public static void postOrderIter(Node root, List<Integer> li){
        Stack<Node> st = new Stack<>();

        Node node = root;

        while(!st.isEmpty() || node!=null){
            if(node!=null){
                st.add(node);
                node = node.left;
            }
            else{
                Node temp = st.peek().right;

                if(temp==null){
                    temp = st.pop();
                    li.add(temp.data);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp = st.pop();
                        li.add(temp.data);
                    }
                }
                else{
                    node = temp;
                }
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

        postOrderIter(root, li);

        System.out.println(li);
    }
}
