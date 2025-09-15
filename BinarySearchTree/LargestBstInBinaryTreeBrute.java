class Node {
    int data;
    Node left;
    Node right;

    Node(int data1) {
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

public class LargestBstInBinaryTreeBrute {

    public static boolean isValidBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max) return false;

        return isValidBST(root.left, min, root.data) &&
               isValidBST(root.right, root.data, max);
    }

    public static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static int findLarg(Node root) {
        if (root == null) return 0;

        if (isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return countNodes(root);  
        }

        return Math.max(findLarg(root.left), findLarg(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        int ans = findLarg(root);
        System.out.println(ans); 
    }
}
