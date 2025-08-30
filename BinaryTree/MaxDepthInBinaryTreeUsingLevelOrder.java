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

public class MaxDepthInBinaryTreeUsingLevelOrder{
    public static int depth(Node root){
        if(root==null){
            return 0;
        }
        
        int count = 0;
        Queue<Node> que = new LinkedList<>();

        que.add(root);

        while(!que.isEmpty()){
            count++;
            int size = que.size();

            for(int i=0 ; i<size ; i++){
                Node node = que.poll();

                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
            }
        }

        return count;
    }
    public static void main(String[] args){
        
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.left.left = new Node(51);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(depth(root));    
    }
}