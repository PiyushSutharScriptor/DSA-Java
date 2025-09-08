class Node{
    int data;
    Node left;
    Node right;

    Node(int data1){
        this.data = data1;
        this.left = this.right = null;
    }
}
public class ArrayToBinarySearchTree {

    public static Node createBST(int val, Node root){
        if(root==null){
            return new Node(val);
        }

        if(val<root.data){
            root.left = createBST(val, root.left);
        }
        else{
            root.right = createBST(val, root.right);
        }
        return root;

    }
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 2, 5, 30, 50};

        Node root = null;

        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            root = createBST(arr[i],root);
        }

        System.out.println(root.data);
    }
}
