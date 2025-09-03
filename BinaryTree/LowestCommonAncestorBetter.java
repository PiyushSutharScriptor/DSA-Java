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


public class LowestCommonAncestorBetter{

    public static boolean findPath(Node root, int target , List<Integer>li){
        if(root==null) return false;

        li.add(root.data);

        if(root.data==target) return true;

        if(findPath(root.right, target, li) || findPath(root.left, target, li)){
            return true;
        }

        li.remove(li.size()-1);
        return false;
    }
    public static void main(String[] args){
        
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        int a = 5;
        int b = 6;

        List<Integer> res1 = new ArrayList<>();
        findPath(root , a , res1);

        List<Integer> res2 = new ArrayList<>();
        findPath(root , b , res2);
        

        int ans = -1;

        int i=0;
        while(i<res1.size() && i<res2.size()){
            if(res1.get(i) == res2.get(i)){
                ans = res1.get(i);
            }
            else{
                break;
            }

            i++;
        }

        System.out.println(ans);

    }
}