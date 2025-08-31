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

public class SameTreeOrNotOpttimized {

    public static boolean check(Node root1 , Node root2){

        
        if(root1==null && root2==null) return true;

        if(root1==null || root2==null) return false;

        if(root1.data!=root2.data) return false;

        return check(root1.left ,root2.left) && 
        check(root1.right , root2.right);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        Node root2 = new Node(2);
        root2.left = new Node(3);
        root2.right = new Node(40);
        root2.left.left = new Node(5);
        root2.left.right = new Node(6);
        root2.right.left = new Node(7);
        
        System.out.println(check(root,root2));
    }
 
}
