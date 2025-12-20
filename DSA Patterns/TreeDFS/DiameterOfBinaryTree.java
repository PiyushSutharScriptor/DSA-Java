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

public class DiameterOfBinaryTree {

    private static int res = 0;

    public static int findDiameter(Node root){
        if(root==null) return 0;

        int lh = findDiameter(root.left);
        int rh = findDiameter(root.right);

        int curr = 1 + lh + rh;
        res = Math.max(curr,res);

        return 1+Math.max(lh,rh);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        res = 0; //apply this line for leetcode for test cases 
        findDiameter(root);
        System.out.println(res-1);
    }
}
