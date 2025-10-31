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

class Temp{
    int idx;
    int level;
    Node node;

    Temp(int idx1, int level1, Node node1){
        this.idx = idx1;
        this.level = level1;
        this.node = node1;
    }
}


public class HorizontalTraversal {

    public static List<List<Integer>> findTraver(Node node){

        Queue<Temp> que = new LinkedList<>();
        que.add(new Temp(0, 0, node));

        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
        while(!que.isEmpty()){
            Temp el = que.poll();

            int ind = el.idx;
            int lvl = el.level;
            Node nod = el.node;

            if(nod.left!=null){
                que.add(new Temp(ind-1, lvl+1, nod.left));
            }
            if(nod.right!=null){
                que.add(new Temp(ind+1, lvl+1, nod.right));
            }
        }

        
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<List<Integer>> res = findTraver(root);
        System.out.println(res);
    }
}
