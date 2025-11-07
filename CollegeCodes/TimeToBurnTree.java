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

public class TimeToBurnTree
{
	public static void main(String[] args) {
	    Node root = new Node(40);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(30);
        
        Node fNode = root.left.left;
        
        //child-parent map
        Map<Node,Node> mp = new HashMap<>();
        mp.put(root,null);
        //visited map : 
        Map<Node,Boolean> visited = new HashMap<>();
        visited.put(root,false);
        
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
                    visited.put(el.left,false);
                }
                
                if(el.right!=null){
                    que.add(el.right);
                    mp.put(el.right,el);
                    visited.put(el.right,false);
                }
                
                size--;
            }
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(fNode);
        
        int dis = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            while(size!=0){
                
                Node el = q.poll();
                visited.put(el,true);
                
                if(el.left!=null && !visited.get(el.left)){
                    q.add(el.left);
                }
                
                if(el.right!=null && !visited.get(el.right)){
                    q.add(el.right);
                }
                
                if(mp.get(el)!=null && !visited.get(mp.get(el))){
                    q.add(mp.get(el));
                }
                
                size--;
            }
            
            dis++;
        }
        
        System.out.println(dis-1);
	}
}