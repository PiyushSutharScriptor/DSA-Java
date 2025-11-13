import java.util.*;

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

public class PreInOrderConstruct{

    public static Node findTree(int inStart, int inEnd, int[] in, int preStart, int preEnd, int[] pre, Map<Integer,Integer> map){

        if(inStart>inEnd || preStart>preEnd) return null;

        Node root = new Node(pre[preStart]);

        int inRoot = map.get(pre[preStart]);
        int leftNums = inRoot-inStart;

        root.left = findTree(inStart, inRoot-1, in, preStart+1, preStart + leftNums, pre, map);

        root.right = findTree(inRoot+1, inEnd, in, preStart + leftNums + 1, preEnd, pre, map);

        return root;

    }

    public static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        int[] in = {40,20,50,10,60,30};
        int[] pre = {10,20,40,50,30,60};

        int m = in.length;
        int n = pre.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<m ; i++){
            map.put(in[i],i);
        }

        Node root = findTree(0,m-1,in,0,n-1,pre,map);

        printInorder(root);
    }
}