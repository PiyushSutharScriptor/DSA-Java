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


public class RootToNodePathOptimized{

    public static boolean isPossible(Node root, int target, List<Integer> li){
        if(root==null) return false;

        li.add(root.data);

        if(root.data==target) return true;

        if(isPossible(root.left, target, li) || isPossible(root.right, target, li)){
            return true;
        }

        li.remove(li.size()-1);
        return false;

    }

    public static List<Integer> findPath(Node root, int target){
        ArrayList<Integer> li = new ArrayList<>();

        if(root==null){
            return li;
        }
        isPossible(root, target, li);
        return li;
    }

    public static void main(String[] args){
        
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        int target = 7;

        List<Integer> res = findPath(root , target);

        System.out.println(res);
    }
}