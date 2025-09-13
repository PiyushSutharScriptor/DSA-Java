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

public class PreOrderToBSTBetter {
    public static Node preOrderToBst(int n, Node root){
        if(root==null) return new Node(n);

        if(n>root.data){
            root.right =  preOrderToBst(n, root.right);
        }
        else{
            root.left = preOrderToBst(n, root.left);
        }
        
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {8,5,1,7,10,12};

        Node root = new Node(arr[0]);

        for(int i=1 ; i<arr.length ; i++){
            root = preOrderToBst(arr[i],root);
        }

        System.out.println(root.data);
    }
}
