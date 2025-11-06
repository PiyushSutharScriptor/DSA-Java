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

public class NodesWithKDistance
{
	public static void main(String[] args) {
	    Node root = new Node(40);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(30);
        
        Node fNode = root.left.left;
        
        Map<Node,Node> mp = new HashMap<>();
        mp.put(root,null);
        
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        
        //child -> parent
        while(!que.isEmpty()){
            int size = que.size();
            
            while(size!=0){
                Node el = que.poll();
                
                if(el.left!=null){
                    que.add(el.left);
                    mp.put(el.left,el);
                }
                
                if(el.right!=null){
                    que.add(el.right);
                    mp.put(el.right,el);
                }
                
                size--;
            }
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(fNode);
        
        int count = 0;
        while(!q.isEmpty() && count!=2){
            int size = que.size();
            count++;
            while(size!=0){
                Node el = que.poll();
                
                if(el.left!=null){
                    que.add(el.left);
                    mp.put(el.left,el);
                }
                
                if(el.right!=null){
                    que.add(el.right);
                    mp.put(el.right,el);
                }
                
                size--;
            }
        }
        
        System.out.println(mp);
	}
}