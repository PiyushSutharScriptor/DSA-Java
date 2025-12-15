import java.util.*;

class Node{
    Node left;
    Node right;
    Node next;
    int data;

    Node(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
        this.next = null;
    }
}

public class ConnectLevelOrderSibling {

    public static Node connectLevel(Node root){
        if(root==null) return null;

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            int size = que.size();

            for(int i=0 ; i<size ; i++){
                Node el = que.poll();

                if(i<size-1){
                    el.next = que.peek();
                }
                else{
                    el.next = null;
                }

                if(el.left!=null){
                    que.add(el.left);
                }
                if(el.right!=null){
                    que.add(el.right);
                }
            }
        }

        return root;
    }

    public static void preOrder(Node root){
        if(root==null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node res = connectLevel(root);
        preOrder(res);
    }
}
