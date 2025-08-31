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

public class DiameterOfBinaryTreeBrute {

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return 1+Math.max(lh,rh);
    }

    public static int diameter(Node root){
        if(root==null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);

        return Math.max(lh+rh, Math.max(leftDia,rightDia));
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
 
        System.out.println(diameter(root));
    }
}
