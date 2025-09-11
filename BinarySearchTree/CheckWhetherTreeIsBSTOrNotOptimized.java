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

public class CheckWhetherTreeIsBSTOrNotOptimized {
    public static boolean myFun(Node root){
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValid(Node root, long min, long max){
        if(root==null) return true;

        if(root.data <= min || root.data >= max) return false;

        return isValid(root.left, min, root.data) && 
               isValid(root.right, root.data, max);
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
        System.out.println(ans);
    }
}
