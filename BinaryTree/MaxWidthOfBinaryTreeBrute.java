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

public class MaxWidthOfBinaryTreeBrute {

    // Brute force: BFS level by level and count nodes
    public static int findWidth(Node root) {
        if (root == null) return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size(); // nodes in this level
            maxWidth = Math.max(maxWidth, size);

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        int ans = findWidth(root);
        System.out.println("Max Width (Brute): " + ans);
    }
}
