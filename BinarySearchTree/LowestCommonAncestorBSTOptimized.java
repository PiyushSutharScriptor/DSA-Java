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

public class LowestCommonAncestorBSTOptimized {
    public static Node lcaOfBst(Node root, int a, int b){
        if(root==null) return null;

        if(a<root.data && b<root.data){
            return lcaOfBst(root.left, a, b);
        }
        else if(a>root.data && b>root.data){
            return lcaOfBst(root.right, a, b);
        }
        else{
            return root;
        }
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
