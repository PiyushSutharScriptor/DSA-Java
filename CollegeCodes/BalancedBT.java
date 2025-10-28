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

public class BalancedBT {

    public static int findT(Node node){
        if(node==null) return 0;

        int l = findT(node.left);
        int r = findT(node.right);

        if(l==-1 || r==-1) return -1;
        if(Math.abs(l-r)>1) return -1;
        return 1+Math.max(l,r);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.left.left = new Node(7);

        int res = findT(root);
        if(res==-1){
            System.out.println("False");
        }
        else System.out.println("True");
    }
}
