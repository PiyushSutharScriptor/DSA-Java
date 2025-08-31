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

public class DiameterOfBinaryTreeOptimized {

    public static int maxi = 0;
    
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }

        int lh = diameter(root.left);
        int rh = diameter(root.right);

        maxi = Math.max(maxi, lh+rh);
        return 1+Math.max(lh,rh);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
 
        diameter(root);
        System.out.println(maxi);
    }
}
