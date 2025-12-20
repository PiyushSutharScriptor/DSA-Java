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

public class PathSum1{

    public static boolean findPath(Node root, int target){
        if(root==null) return false;

        if(root.left==null && root.right==null){
            return (target==root.data);
        }

        return 
        findPath(root.left, target-root.data) ||
        findPath(root.right, target-root.data);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        int target = 7;
        System.out.println(findPath(root,target));
    }
}