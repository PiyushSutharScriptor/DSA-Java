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

public class RecoverBstOptimized {

    private static Node first,last,prev;

    public static void recover(Node root){
        first = last = prev = null;

        inorder(root);

        if(first!=null && last!=null){
            int t = first.data;
            first.data = last.data;
            last.data = t;
        }
    }

    public static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);

        if(prev!=null && (root.data < prev.data)){
            //first
            if(first==null){
                first = prev;
                last = root;
            }
            //second
            else{
                last = root;
            }
        }

        prev = root;

        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(70);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(20);
       
        recover(root);
    }
}
