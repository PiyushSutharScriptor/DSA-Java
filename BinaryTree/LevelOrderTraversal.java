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
public class LevelOrderTraversal{
    public static void traversal(List<List<Integer>> li , Node root){
        Queue <Node> que = new LinkedList<>();

        if(root==null){
            return;
        }

        que.add(root);

        while(!que.isEmpty()){
            int size = que.size();
            List <Integer> newList = new ArrayList<>();

            for(int i=0 ; i<size ; i++){
                Node el = que.poll();
                newList.add(el.data);

                if(el.left!=null){
                    que.add(el.left);
                }
                if(el.right!=null){
                    que.add(el.right);
                }
            }

            li.add(newList);
        }
    }

    public static void main(String[] args){
        
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        List<List <Integer>> li = new ArrayList<>();
        traversal(li, root);

        System.out.println(li);
    }
}