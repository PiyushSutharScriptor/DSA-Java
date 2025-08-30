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

public class MaxDepthInBinaryTreeUsingRecursion {

    public static int depth(Node root){
        if(root==null){
            return 0;
        }

        int lh = depth(root.left);
        int rh = depth(root.right);

        return 1+Math.max(lh,rh);
    }
    public static void main(String[] args){
        
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(depth(root));    
    }
}
