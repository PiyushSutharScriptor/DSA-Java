import java.util.*;

class Pair {
    Node node;
    int index;
    Pair(Node n, int i) {
        this.node = n;
        this.index = i;
    }
}

public class MaxWidthOfBinaryTreeOptimized {

    // Optimized: BFS with position indexing
    public static int findWidth(Node root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int minIndex = q.peek().index;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int currIndex = p.index - minIndex; // normalize to prevent overflow
                if (i == 0) first = currIndex;
                if (i == size - 1) last = currIndex;

                if (p.node.left != null) q.add(new Pair(p.node.left, 2 * currIndex + 1));
                if (p.node.right != null) q.add(new Pair(p.node.right, 2 * currIndex + 2));
            }
            maxWidth = Math.max(maxWidth, last - first + 1);
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
        System.out.println(ans);
    }
}
