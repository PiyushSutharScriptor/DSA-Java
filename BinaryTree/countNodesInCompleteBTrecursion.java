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

public class countNodesInCompleteBTrecursion{

    public static int count;

    public static void countNodes(Node root){
        if(root==null) return;
        count++;
        countNodes(root.left);
        countNodes(root.right);
        
    }

    // Second way : 
    
    // public static int countNodes(Node root){
    //     if(root==null) return 0;
        
    //     return 1+countNodes(root.left)+countNodes(root.right);
    // }

    
    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(30);
        root.right.right = new Node(40);

        count = 0;
        countNodes(root);
        System.out.println(count);
    }
}
