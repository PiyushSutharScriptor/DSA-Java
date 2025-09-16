import java.util.*;

public class BreadthFirstSearchInGraphs {

    public static List<Integer> findBfs(int edges[][], int v, int k) {
        List<List<Integer>> li = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            li.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int U = edge[0];
            int V = edge[1];

            li.get(U).add(V);
            li.get(V).add(U);
        }

        boolean visited[] = new boolean[v];
        List<Integer> res = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();

        que.add(k);
        visited[k] = true;

        while (!que.isEmpty()) {
            int node = que.poll();
            res.add(node);

            for (int el : li.get(node)) {
                if (!visited[el]) {
                    que.add(el);
                    visited[el] = true;
                }
            }

        }

        return res;

        //you can seperate the logic of for loop inside while
        // using helper function for more clarity
    }

    public static void helper(int i, boolean[] visited, List<List<Integer>> li, Queue<Integer> que) {
        visited[i] = true;

    }

    public static void main(String[] args) {
        int v = 5;
        int edges[][] = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 } };
        int k = 0;

        List<Integer> li = findBfs(edges, v, k);
        System.out.println(li);
    }
}
