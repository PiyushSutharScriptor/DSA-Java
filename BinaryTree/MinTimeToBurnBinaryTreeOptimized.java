import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data1) {
        this.data = data1;
        this.left = null;
        this.right = null;
    }

}

public class MinTimeToBurnBinaryTreeOptimized {
    public static void markParent(Node root, Map<Node, Node> parent){
        if(root==null) return;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node node = q.poll();

            if(node.left!=null){
                q.add(node.left);
                parent.put(node.left, node);
            }

            if(node.right!=null){
                q.add(node.right);
                parent.put(node.right, node);
            }
        }
    }

    public static int minTime(Node root, Node target){
        Map<Node,Node> parent = new HashMap<>();
        markParent(root, parent);

        Map<Node, Boolean> visited = new HashMap<>();
        Queue<Node> que = new LinkedList<>();

        que.add(target);
        visited.put(target,true);

        int time = 0; 
        
        while(!que.isEmpty()){
            int size = que.size();
            boolean burn = false;

            for(int i=0 ; i<size ; i++){
                Node node = que.poll();

                if(node.left!=null && visited.get(node.left)==null){
                    que.add(node.left);
                    visited.put(node.left , true);
                    burn = true;
                }

                if(node.right!=null && visited.get(node.right)==null){
                    que.add(node.right);
                    visited.put(node.right , true);
                    burn = true;
                }

                if(parent.get(node)!=null && visited.get(parent.get(node))==null){
                    que.add(parent.get(node));
                    visited.put(parent.get(node) , true);
                    burn = true;
                }
            }

            if(burn) time++;
        }

        return time;
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(30);
        root.right.right = new Node(40);

        Node target = root.left.right;

        int ans = minTime(root, target);
        System.out.println(ans);
    }
}
