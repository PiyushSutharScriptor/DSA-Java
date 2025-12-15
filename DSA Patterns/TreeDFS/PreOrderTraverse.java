class Node{
    Node left;
    Node right;
    int data;

    Node(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

public class PreOrderTraverse {

    public static void InOrder(Node root){
        if(root==null) return;
        System.out.print(root.data + " ");
        InOrder(root.left);
        InOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        InOrder(root);
    }
}
