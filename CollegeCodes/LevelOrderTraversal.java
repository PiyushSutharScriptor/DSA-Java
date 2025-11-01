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

public class LevelOrderTraversal {

    public static List<List<Integer>> findLvl(Node node){
        Queue<Node> que = new LinkedList<>();
        que.add(node);
        
        List<List<Integer>> res = new ArrayList<>();
        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> li = new ArrayList<>();

            while(size!=0){
                Node nd = que.poll();
                if(nd.left!=null) que.add(nd.left);
                if(nd.right!=null) que.add(nd.right);

                li.add(nd.data);
                size--;
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

        List<List<Integer>> ans = findLvl(root);
        System.out.println(ans);
    }
}

