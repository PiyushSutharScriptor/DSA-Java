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

public class DFStraversal{
    public static void preOrder(Node node){
        if(node==null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void postOrder(Node node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public static void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        preOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        postOrder(root);
        System.out.println();
    }
}
