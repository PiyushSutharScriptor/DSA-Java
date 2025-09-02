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
public class RightViewOfBinaryTreeOptimized{
    public static List<Integer> rightView(Node root){
        Queue <Node> que = new LinkedList<>();
        List<Integer> li = new ArrayList<>();

        if(root==null){
            return li;
        }

        que.add(root);

        while(!que.isEmpty()){
            int size = que.size();

            for(int i=0 ; i<size ; i++){
                Node node = que.poll();

                if(i==size-1){
                    li.add(node.data);
                }
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
            }
        }

        return li;
    }

    public static void main(String[] args){
        
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        List<Integer> res = rightView(root);

        System.out.println(res);
    }
}