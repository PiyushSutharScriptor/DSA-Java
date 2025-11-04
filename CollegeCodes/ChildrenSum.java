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

public class ChildrenSum {

    public static int find(Node node){
        int l = 0;
        int r = 0;

        if(node.left!=null){
            if(node.left.data<node.data) node.left.data = node.data;
            l = find(node.left);
        }
        if(node.right!=null){
            if(node.right.data<node.data) node.right.data = node.data;
            r = find(node.right);
        }

        return node.data = l+r>node.data ? l+r : node.data;

    }

    public static void preOrder(Node node){
        if(node==null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(30);
        root.right.right = new Node(40);

        find(root);

        preOrder(root);
    }
}
