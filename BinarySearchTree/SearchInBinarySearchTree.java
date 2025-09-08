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

public class SearchInBinarySearchTree {
    public static Node searchNode(Node root, int target){
        if(root==null) return null;

        if(root.data == target) return root;
        
        if(target<root.data){
            return searchNode(root.left, target);
        }
        else{
            return searchNode(root.right, target);
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

        int target = 70;

        Node ans = searchNode(root, target);
        System.out.println(ans.data); //for !null directly print ans.data or else handle
                                        // NullPointerException by using 
                                        /*
                                            if(ans!=null) sout(ans.data)
                                            else sout("not found")
                                        */
    }
}

