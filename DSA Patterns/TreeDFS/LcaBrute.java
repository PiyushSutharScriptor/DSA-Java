import java.util.*;

class Node{
    Node left;
    Node right;
    int data;

    Node(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

public class LcaBrute {

    public static boolean findNodePath(Node root, Node target, List<Node> li){
        if(root==null) return false;

        li.add(root);
        if(root==target) return true;

        if(findNodePath(root.left, target, li) || findNodePath(root.right, target, li)){
            return true;
        }

        li.remove(li.size()-1);
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node p = root.left.left; //4
        Node q = root.left.right; //5

        List<Node> li1 = new ArrayList<>();
        List<Node> li2 = new ArrayList<>();

        findNodePath(root, p, li1);
        findNodePath(root, q, li2);

        Node res = null;
        int i = 0;

        while(i<li1.size() && i<li2.size()){
            if(li1.get(i)==li2.get(i)){
                res = li1.get(i);
            }
            else break;
            i++;
        }

        System.out.println(res.data);
    }
}
