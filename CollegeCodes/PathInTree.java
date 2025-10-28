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

public class PathInTree {
    public static void findPath(Node node, int x, List<Integer> li){
        li.add(node.data);
        if(node.data==x) return;

        if(node.left!=null){
            findPath(node.left, x, li);
        }  
        if(node.right!=null){
            findPath(node.right, x, li);
        }

        li.remove(li.size()-1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int x = 5;
        List<Integer> res = new ArrayList<>();

        findPath(root,x,res);
        System.out.println(res);
    }
}
