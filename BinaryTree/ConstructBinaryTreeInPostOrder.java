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

public class ConstructBinaryTreeInPostOrder {
    public static Node buildInPost(int inorder[] , int postorder[]){

        Map<Integer,Integer> inMap = new HashMap<>();

        for(int i=0 ; i<inorder.length ; i++){
            inMap.put(inorder[i] , i);
        }

        Node root = buildInPost(inorder, 0, inorder.length-1 
                                , postorder, 0, postorder.length-1, inMap);

        return root;
    }

    public static Node buildInPost(int[] inorder, int inStart, int inEnd, int postorder[], int postStart, int postEnd, Map<Integer, Integer> inMap){

        if(postStart>postEnd || inStart>inEnd) return null;

        Node root = new Node(postorder[postEnd]);

        int inRoot = inMap.get(root.data);
        int numsLeft = inRoot-inStart;  

        root.left = buildInPost(inorder, inStart, inRoot-1, 
                                postorder, postStart, postStart+numsLeft-1, inMap);
        root.right = buildInPost(inorder, inRoot+1, inEnd, 
                                 postorder, postStart+numsLeft, postEnd-1, inMap);

        return root;
    }

    
    public static void main(String[] args) {
        int inorder[] = {40,20,50,10,60,30};
        int postorder[] = {40,50,20,60,30,10};

        Node ans = buildInPost(inorder,postorder);
        System.out.println(ans.data);
    }
}

