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

public class FindSecondSmallestElementInBST {

    private static int first = -1;
    private static int k = 0;
    
    public static int secondSmall(Node root){
        if(root==null) return -1;

        int left = secondSmall(root.left);
        if(left!=-1) return left;

        k++;
        if(k==1){
            first = root.data;
        }
        if(root.data>first) return root.data;

        return secondSmall(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(20);
        root.left.right = new Node(20);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        int ans = secondSmall(root); //40
        System.out.println(ans);
    }
}
