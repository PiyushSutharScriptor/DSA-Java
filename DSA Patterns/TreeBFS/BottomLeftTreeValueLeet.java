
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

public class BottomLeftTreeValueLeet {

    public static int findNode(Node root){
         if(root==null) return 0;

        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int count = 0;

        while(!que.isEmpty()){
            int size = que.size();

            for(int i=0 ; i<size ; i++){
                Node el = que.poll();
                
                if(i==0) count=el.data;
                if(el.left!=null){
                    que.add(el.left);
                }

                if(el.right!=null){
                    que.add(el.right);
                }
            }   
        }

        return count;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int res = findNode(root);
        System.out.println(res);
    }
}
