import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class BoundaryTraversalOptimized {

    private static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    private static void addLeftBoundary(Node root, List<Integer> res) {
        Node cur = root.left;
        while (cur != null) {
            if (!isLeaf(cur)) res.add(cur.data);
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }

    private static void addRightBoundary(Node root, List<Integer> res) {
        Node cur = root.right;
        Stack<Integer> st = new Stack<>();
        while (cur != null) {
            if (!isLeaf(cur)) st.push(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        while (!st.isEmpty()) {
            res.add(st.pop());
        }
    }

    // Add leaves (DFS)
    private static void addLeaves(Node root, List<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }

    public static List<Integer> btraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        if (!isLeaf(root)) res.add(root.data);

        addLeftBoundary(root, res);  
        addLeaves(root, res);        
        addRightBoundary(root, res); 

        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.left.left.left = new Node(9);

        List<Integer> res = btraversal(root);
        System.out.println(res);  
    }
}
