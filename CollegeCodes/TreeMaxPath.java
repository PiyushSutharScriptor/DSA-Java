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

public class TreeMaxPath {
    public static int sum = 0;

    public static int findMax(Node node){
        if(node==null) return 0;

        int lt = Math.max(0, findMax(node.left));
        int rt = Math.max(0, findMax(node.right));

        sum = Math.max(sum,(lt+rt+node.data));
        return Math.max(lt,rt)+node.data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        findMax(root);
        System.out.println(sum);
    }
}
