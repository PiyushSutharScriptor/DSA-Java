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

public class MinimumNodeInBinarySearchTreeIterative{
    public static Node searchMinNode(Node root){
        if(root == null) return null;

        while(root.left!=null){
            root = root.left;
        }

        return root;
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

