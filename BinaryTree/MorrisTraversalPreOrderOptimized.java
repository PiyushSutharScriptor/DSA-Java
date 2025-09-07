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

public class MorrisTraversalPreOrderOptimized {
    public static List<Integer> morrisPre(Node root){

        Node node = root;

        List<Integer> li = new ArrayList<>();

        while(node!=null){
            if(node.left==null){
                li.add(node.data);
                node = node.right;
            }
            else{
                Node prev = node.left;
                while(prev.right!=null && prev.right!=node){
                    prev = prev.right;  
                }

                if(prev.right==null){
                    prev.right=node;
                    li.add(node.data);
                    node = node.left;
                }
                else{
                    prev.right=null;
                    node = node.right;
                }
            }
        }

        return li;
    }

    
    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(30);
        root.right.right = new Node(40);

        List<Integer> ans = morrisPre(root);
        System.out.println(ans);
    }
}

