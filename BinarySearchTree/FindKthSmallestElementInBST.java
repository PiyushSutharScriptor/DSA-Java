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

public class FindKthSmallestElementInBST {

    private static int count = 0;
    public static int kthSmall(Node root , int k){
        if(root==null) return 0;

        int left = kthSmall(root.left, k);
        if(left!=0) return left;            
                        
        count++;
        if(count==k) return root.data;

        return kthSmall(root.right, k);
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

        int ans = kthSmall(root,k);
        System.out.println(ans);
    }
}

