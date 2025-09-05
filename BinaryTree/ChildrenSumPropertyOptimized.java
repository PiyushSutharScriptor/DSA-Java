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

public class ChildrenSumPropertyOptimized {

    public static void childrenSum(Node root){
        if(root == null) return;

        int sum = 0;

        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;

        if(sum>root.data) root.data = sum;
        else{
            if(root.left!=null) root.left.data = root.data;
            if(root.right!=null) root.right.data = root.data;
        }

        childrenSum(root.left);
        childrenSum(root.right);

        int total = 0;
        if(root.left!=null) total+=root.left.data;
        if(root.right!=null) total+=root.right.data;

        if(root.left!=null || root.right!=null){
            root.data = total;
        }

    }

    public static void traversal(List<List<Integer>> li , Node root){
        Queue <Node> que = new LinkedList<>();

        if(root==null){
            return;
        }

        que.add(root);

        while(!que.isEmpty()){
            int size = que.size();
            List <Integer> newList = new ArrayList<>();

            for(int i=0 ; i<size ; i++){
                Node el = que.poll();
                newList.add(el.data);

                if(el.left!=null){
                    que.add(el.left);
                }
                if(el.right!=null){
                    que.add(el.right);
                }
            }

            li.add(newList);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(30);
        // root.right.right = new Node(40);

        List<List <Integer>> li1 = new ArrayList<>();
        traversal(li1, root);
        
        childrenSum(root);

        List<List <Integer>> li2 = new ArrayList<>();
        traversal(li2, root);

        System.out.println(li1);
        System.out.println(li2);
    }
}
