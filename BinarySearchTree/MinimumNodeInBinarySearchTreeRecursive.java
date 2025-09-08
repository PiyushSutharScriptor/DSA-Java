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

public class MinimumNodeInBinarySearchTreeRecursive{
    public static Node searchMinNode(Node root){
        if(root==null || root.left==null){
            return root;
        }
        return searchMinNode(root.left);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        Node ans = searchMinNode(root);
        System.out.println(ans.data);
    }
}

