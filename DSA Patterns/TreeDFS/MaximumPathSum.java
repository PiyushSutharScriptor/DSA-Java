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

public class MaximumPathSum {

    public static int maxSum = Integer.MIN_VALUE;

    public static int findMax(Node root){
        if(root==null) return 0;

        int lh = Math.max(0,findMax(root.left));
        int rh = Math.max(0, findMax(root.right));

        int curr = root.data + lh + rh;

        maxSum = Math.max(maxSum,curr);

        return root.data + Math.max(lh,rh);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        findMax(root);
        System.out.println(maxSum);
    }
}
