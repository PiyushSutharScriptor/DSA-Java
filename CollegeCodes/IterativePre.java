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

public class IterativePre{
    public static int findMax(Node node){
        if(node==null) return 0;

        int l = findMax(node.left);
        int r = findMax(node.right);

        return 1+Math.max(l,r);
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

        int res = findMax(root);
        System.out.println(res);
    }
}