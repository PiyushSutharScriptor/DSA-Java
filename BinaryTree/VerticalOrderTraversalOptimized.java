import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data1) {
        this.data = data1;
        this.left = this.right = null;
    }
}

class Pair{
    Node node;
    int col;    

    Pair(Node node1,int col1){
        this.node = node1;
        this.col = col1;
    }
    
}

public class VerticalOrderTraversalOptimized {

    public static List<List<Integer>> vtraversal(Node root){

        TreeMap<Integer , List<Integer>> map = new TreeMap<>();
        Queue<Pair> que = new LinkedList<>();

        que.add(new Pair(root,0));

        while(!que.isEmpty()){
            Pair p = que.poll();
            
            Node node = p.node;
            int col = p.col;

            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(node.data);

            if(node.left!=null){
                que.add(new Pair(node.left,col-1));
            }

            if(node.right!=null){
                que.add(new Pair(node.right,col+1));
            }
        }

        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.left.left.left = new Node(9);

        List<List<Integer>> res = vtraversal(root);
        System.out.println(res);
    }
}
