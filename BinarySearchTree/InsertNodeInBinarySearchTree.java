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

public class InsertNodeInBinarySearchTree {

    public static void insertNode(Node root, int key){
        if(root==null) return ;

        Node prev = null;

        while(root!=null){

            prev = root;
            if(key>=root.data){
                root = root.right;
            }
            else{
                root = root.left;
            }
        }

        if(key<=prev.data){
            prev.left = new Node(key);
        }
        else{
            prev.right = new Node(key);
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

        int key = 52;

        insertNode(root, key);
        System.out.println(root.data);

        /*
            if(root==null)  return new Node(key);
            leetcode testcase : 34
        */
    }
}

