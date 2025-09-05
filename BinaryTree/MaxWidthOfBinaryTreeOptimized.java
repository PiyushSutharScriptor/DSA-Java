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

class Pair {
    Node node;
    int num;
    Pair(Node node1, int num1) {
        this.node = node1;
        this.num = num1;
    }
}

public class MaxWidthOfBinaryTreeOptimized {

    public static int findWidth(Node root) {
        if(root==null) return 0;
        
        int ans = 0;
        
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(root,0));
        
        while(!que.isEmpty()){
            int size = que.size();
            int mini = que.peek().num;
            
            int first = 0;
            int last = 0;
            
            for(int i=0 ; i<size ; i++){
                Pair p = que.poll();    
                
                int cmini = p.num-mini;
                Node node = p.node;
                
                if(i==0) first = cmini;
                if(i==size-1) last = cmini;
                
                if(node.left!=null){
                    que.add(new Pair(node.left,2*cmini+1));
                }
                if(node.right!=null){
                    que.add(new Pair(node.right,2*cmini+2));
                }
            }
            
            ans = Math.max(ans, last-first+1);
        }
        
        return ans; 
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        int ans = findWidth(root);
        System.out.println(ans);
    }
}
