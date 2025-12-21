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


public class LcaOptimized {

    public static Node findLca(Node root, Node p, Node q){

        if(root==null) return null;

        if(root==p || root==q) return root;
        
        Node lt = findLca(root.left, p, q);
        Node rt = findLca(root.right, p, q);

        if(lt!=null && rt!=null) return root;

        return lt!=null ? lt : rt;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node p = root.left.left; //4
        Node q = root.left.right; //5

        Node res = findLca(root,p,q);
        System.out.println(res.data);
    }
}
