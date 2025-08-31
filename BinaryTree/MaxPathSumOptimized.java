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

public class MaxPathSumOptimized {
    
    public static int path=Integer.MIN_VALUE;

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lh = Math.max(0, height(root.left));
        int rh = Math.max(0 , height(root.right));

        path = Math.max(path, lh+rh+root.data);

        return Math.max(lh,rh)+root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        
        height(root);
        System.out.println(path);
    }
}
