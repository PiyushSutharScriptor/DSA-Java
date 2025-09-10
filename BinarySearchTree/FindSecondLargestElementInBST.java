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

public class FindSecondLargestElementInBST{
    private static int k = 0;
    private static int first = -1;

    public static int secondLarg(Node root){
        if(root==null) return -1;

        int right = secondLarg(root.right);
        if(right!=-1) return right;

        k++;
        if(k==1) first=root.data;
        if(root.data<first) return root.data;

        return secondLarg(root.left);
    }


    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(60);
        root.right.right = new Node(60);

        int ans = secondLarg(root); //40
        System.out.println(ans);
    }
}
