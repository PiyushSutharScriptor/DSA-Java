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

public class LeftSideView {

    public static List<Integer> leftView(Node root){
        if(root==null) return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        
        while(!que.isEmpty()){
            int size = que.size();

            for(int i=0 ; i<size ; i++){
                Node el = que.poll();

                if(el.left!=null){
                    que.add(el.left);
                }
                if(el.right!=null){
                    que.add(el.right);
                }

                if(i==0) res.add(el.data);
            }
        }

        return res;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> res = leftView(root);
        System.out.println(res);
    }   
}
