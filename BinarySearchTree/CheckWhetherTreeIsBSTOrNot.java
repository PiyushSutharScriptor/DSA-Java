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

public class CheckWhetherTreeIsBSTOrNot {
    public static boolean myFun(Node root){
        if(root==null) return true;

        // check left subtree max < root
        if(!checkLeft(root.left, root.data)) return false;

        // check right subtree min > root
        if(!checkRight(root.right, root.data)) return false;

        // recursively check for left and right
        return myFun(root.left) && myFun(root.right);
    }

    private static boolean checkLeft(Node root, int val){
        if(root==null) return true;
        if(root.data >= val) return false;
        return checkLeft(root.left,val) && checkLeft(root.right,val);
    }

    private static boolean checkRight(Node root, int val){
        if(root==null) return true;
        if(root.data <= val) return false;
        return checkRight(root.left,val) && checkRight(root.right,val);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        boolean ans = myFun(root);
        System.out.println(ans);  // true for valid BST
    }
}
