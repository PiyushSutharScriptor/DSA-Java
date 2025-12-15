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

public class LevelOrderTraversal {

    public static List<List<Node>> levelTraversal(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        if(root==null) return null;

        List<List<Node>> res = new ArrayList<>();

        while(!que.isEmpty()){
            int size = que.size();

            List<Node> li = new ArrayList<>();
            for(int i=0 ; i<size ; i++){
                Node el = que.poll();
                li.add(el);

                if(el.left!=null){
                    que.add(el.left);
                }
                if(el.right!=null){
                    que.add(el.right);
                }
            }

            res.add(li);
        }
        
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<List<Node>> res = levelTraversal(root);
        //printing data of nodes as per level
        for(int i=0 ; i<res.size() ; i++){
            for(Node el : res.get(i)){
                System.out.print(el.data + " ");
            }
            System.out.println();
        }

    }
}


