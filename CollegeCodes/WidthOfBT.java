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

public class WidthOfBT {
    
    public static int findWid(Node node){
        int cnt = 0;

        while(node!=null){
            if(node.left!=null) node = node.left;
            else node = node.right;
            cnt++;
        }

        return cnt;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        
        int l = findWid(root.left);
        int r = findWid(root.right);

        System.out.println(l+r+1);
    }
}
