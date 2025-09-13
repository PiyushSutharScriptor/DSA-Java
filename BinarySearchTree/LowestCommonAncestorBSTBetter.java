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

public class LowestCommonAncestorBSTBetter {
    public static Node lcaOfBst(Node root, int a, int b){
        if(root==null) return null;

        if(root.data==a || root.data==b) return root;
        Node left = lcaOfBst(root.left, a, b);
        Node right = lcaOfBst(root.right, a, b);

        if(left!=null && right!=null) return root;

        return (left!=null) ? left : right;

    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        int a = 30;
        int b = 10;

        Node ans = lcaOfBst(root,a,b);
        System.out.println(ans.data);
    }
}
