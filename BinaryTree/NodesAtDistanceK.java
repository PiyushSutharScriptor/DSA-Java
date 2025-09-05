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

public class NodesAtDistanceK {

    // Step 1: build parent mapping
    public static Map<Node, Node> findParent(Node root) {
        Map<Node, Node> map = new HashMap<>();
        if (root == null) return map;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();

            if (node.left != null) {
                q.add(node.left);
                map.put(node.left, node);
            }
            if (node.right != null) {
                q.add(node.right);
                map.put(node.right, node);
            }
        }
        return map;
    }

    // Step 2: BFS to find nodes at distance k
    public static List<Integer> distanceK(Node root, Node target, int k) {
        Map<Node, Node> parentMap = findParent(root);
        Set<Node> visited = new HashSet<>();
        Queue<Node> q = new LinkedList<>();

        q.add(target);
        visited.add(target);

        int dist = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            if (dist == k) break; // stop when we reach k

            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                // Left child
                if (node.left != null && !visited.contains(node.left)) {
                    visited.add(node.left);
                    q.add(node.left);
                }
                // Right child
                if (node.right != null && !visited.contains(node.right)) {
                    visited.add(node.right);
                    q.add(node.right);
                }
                // Parent
                Node parent = parentMap.get(node);
                if (parent != null && !visited.contains(parent)) {
                    visited.add(parent);
                    q.add(parent);
                }
            }
            dist++;
        }

        // Collect all nodes in queue (these are at distance k)
        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            result.add(q.poll().data);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(30);
        root.right.right = new Node(40);

        Node target = root.left.right; // node with value 5
        int k = 2;

        List<Integer> ans = distanceK(root, target, k);
        System.out.println(ans);
    }
}
