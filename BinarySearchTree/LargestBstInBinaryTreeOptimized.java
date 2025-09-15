class Node {
    int data;
    Node left, right;

    Node(int data1) {
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}


class Info {
    boolean isBST;
    int size;   
    int min;    
    int max;    

    Info(boolean isBST, int size, int min, int max) {
        this.isBST = isBST;
        this.size = size;
        this.min = min;
        this.max = max;
    }
}

public class LargestBstInBinaryTreeOptimized {
    private static int maxSize = 0;

    public static int myFun(Node root) {
        maxSize = 0;
        helper(root);
        return maxSize;
    }

    private static Info helper(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info left = helper(root.left);
        Info right = helper(root.right);

        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            int currSize = left.size + right.size + 1;
            maxSize = Math.max(maxSize, currSize);
            return new Info(true, currSize,
                            Math.min(root.data, left.min),
                            Math.max(root.data, right.max));
        }

        return new Info(false, 0, 0, 0);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        int ans = myFun(root);
        System.out.println(ans);
    }
}
