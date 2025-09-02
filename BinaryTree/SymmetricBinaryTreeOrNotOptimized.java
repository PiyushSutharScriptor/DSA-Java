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
public class SymmetricBinaryTreeOrNotOptimized{

    public static boolean isSym(Node root){
        if(root==null) return true;

        return mirror(root.left, root.right);
    }
    
    public static boolean mirror(Node a, Node b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;    

        return (a.data == b.data) &&
               mirror(a.left, b.right) &&
               mirror(a.right, b.left);
    }

    public static void main(String[] args){
        
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(isSym(root));
    }
}