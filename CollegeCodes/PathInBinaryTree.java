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

public class PathInBinaryTree {

    public static void findPath(Node node, List<Integer>res, int t){

        if(node==null) res.remove(res.size()-1);

        if(node.data==t) return;
        res.add(node.data);

        if(node.left!=null) findPath(node.left, res, t);
        if(node.right!=null) findPath(node.right, res, t);

    }  

    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(10);
        root.right.right = new Node(15);

        List<Integer> res = new ArrayList<>();

        findPath(root,res,10);
        System.err.println(res);

        List<Integer> res1 = new ArrayList<>();

        findPath(root,res1,15);
        System.err.println(res1);
    }
}
