import java.util.*;

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

public class TwoSumInBstBrute {
    public static boolean isSum(Node root, int k){
        List<Integer> li = new ArrayList<>();
        preorder(root,li);

        int i=0;
        int j=li.size()-1;      

        while(i<=j){
            int sum = li.get(i)+li.get(j);  

            if(sum==k) return true;
            else if(sum<k) i++;
            else j--;
        }

        return false;
    }

    public static void preorder(Node root, List<Integer> li){
        if(root==null) return;
        preorder(root.left, li);
        li.add(root.data);
        preorder(root.right, li);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        int k = 400;
        System.out.println(isSum(root,k));
    }
}
