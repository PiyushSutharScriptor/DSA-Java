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

public class PathOfNode{

    public static boolean findPath(Node root, Node a, List<Node> res){
        if(root==null) return false;

        res.add(root);
        if(root==a) return true;

        
        if(findPath(root.left, a, res) || findPath(root.right, a, res)){
            return true;
        }

        res.remove(res.size()-1);
        return false;
    }

    public static void print(List<Node> res){
        for(Node nd : res){
            System.out.print(nd.data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node a = root.left.left;
        Node b = root.left.right;

        List<Node> res1 = new ArrayList<>();

        findPath(root,a,res1);
        print(res1);
        
        res1.clear();

        findPath(root, b, res1);
        print(res1);
    }
}