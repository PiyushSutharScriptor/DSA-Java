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


public class ZigZagTraversalOptimized {

    public static void zigZag(Node root, List<List<Integer>> li){
        if(root==null){
            return;
        }

        Queue<Node> que = new LinkedList<>();
        
        que.add(root);

        boolean flag = true;

        while(!que.isEmpty()){
            List<Integer> newLi = new ArrayList<>();
            int size = que.size();

            for(int i=0 ; i<size ; i++){
                Node node = que.poll();
                newLi.add(node.data);
                
                if(node.left!=null){
                    que.add(node.left);
                }
                
                if(node.right!=null){
                    que.add(node.right);
                }
            }

            if(!flag){
                Collections.reverse(newLi);
            }
            
            flag = !flag;
            li.add(newLi);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        List<List<Integer>> li = new ArrayList<>();
        zigZag(root , li);
        System.out.println(li);
    }       
}
