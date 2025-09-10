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

public class FindKthLargestElementInBST {

    private static int count = 0;
    public static int kthLarg(Node root , int k){
        if(root==null) return 0;

        int right = kthLarg(root.right, k);
        if(right!=0) return right;            
                        
        count++;
        if(count==k) return root.data;

        return kthLarg(root.left, k);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        int k = 3;

        int ans = kthLarg(root,k);
        System.out.println(ans);
    }
}

