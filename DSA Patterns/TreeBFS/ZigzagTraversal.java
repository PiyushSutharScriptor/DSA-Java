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

public class ZigzagTraversal {

    public static void zigZag(Node root,List<List<Integer>> res){
        if(root==null) return;
        
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        boolean flag = true;

        while(!que.isEmpty()){
            int size = que.size();

            List<Integer> li = new ArrayList<>();
            for(int i=0 ; i<size ; i++){
                Node el = que.poll();
                li.add(el.data);

                if(el.left!=null){
                    que.add(el.left);
                }
                if(el.right!=null){
                    que.add(el.right);
                }
            }
            if(!flag){
                Collections.reverse(li);
            }
            flag = !flag;
            res.add(li);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<List<Integer>> res = new LinkedList<>();

        zigZag(root,res);
        System.out.println(res);
    }
}
