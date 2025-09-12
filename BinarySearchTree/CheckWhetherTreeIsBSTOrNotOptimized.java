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
    public static boolean isValid(Node root, int min, int max){
        if(root==null) return true;
        
        if(root.data>=max || root.data<=min) return false;
        
        return isValid(root.left, min, root.data)
        && isValid(root.right,root.data,max);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        System.out.println(isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
