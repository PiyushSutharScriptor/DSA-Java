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

public class PathSum2 {

    public static void findPairs(Node root, List<Integer> li, int target, List<List<Integer>> res){
        if(root==null) return;

        li.add(root.data);

        if(root.left==null && root.right==null){
            if(root.data==target){
                res.add(new ArrayList<>(li));
            }
        }
        else{   
            findPairs(root.left, li, target-root.data, res);
            findPairs(root.right, li, target-root.data, res);
        }

        li.remove(li.size()-1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(1);
        root.left.right = new Node(5);
        
        int target = 4;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        findPairs(root,li,target,res);
        System.out.println(res);
    }
}
