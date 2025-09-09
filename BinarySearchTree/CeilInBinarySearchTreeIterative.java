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

public class CeilInBinarySearchTreeIterative {
    
    public static int searchCeil(Node root, int key){
        int ceil = -1;

        while(root!=null){
            if(root.data>=key) ceil = root.data;
            if(root.data>key){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }

        return ceil;
    }
    

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

       int key = 70;
        
        int res = searchCeil(root, key);
        System.out.println(res);
        
        
    }
}

