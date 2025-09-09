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

public class CeilInBinarySearchTreeRecursive {
    private static int ceil = -1;
 
    public static Node searchCeil(Node root, int key){
        if(root==null) return null;
        
        if(root.data>=key) ceil = root.data;
        if(root.data>key){
            return searchCeil(root.left, key);
        }
        else{
            return searchCeil(root.right, key);
        }
        
    }                                       

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        int key = 50;
        searchCeil(root, key);
        System.out.println(ceil);
    }
}

