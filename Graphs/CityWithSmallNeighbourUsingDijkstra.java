import java.util.*;

class Pair implements Comparable<Pair> {
    int dist;
    int node;

    Pair(int dist1, int node1) {
        this.dist = dist1;
        this.node = node1;
    }

    @Override
    public int compareTo(Pair other) {
        return this.dist - other.dist;
    }
}

public class CityWithSmallNeighbourUsingDijkstra {

    public static int dijkstra(int[][] edges, int src, int dst, int v) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            int U = edge[0], V = edge[1], W = edge[2];
            adj.get(U).add(new Pair(W, V));
            adj.get(V).add(new Pair(W, U)); 
        }

        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, src));

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int node = p.node;
            int d = p.dist;

            if (node == dst) return d; 

            if (d > dist[node]) continue;

            for (Pair nei : adj.get(node)) {
                int nextNode = nei.node;
                int weight = nei.dist;

                if (d + weight < dist[nextNode]) {
                    dist[nextNode] = d + weight;
                    pq.add(new Pair(dist[nextNode], nextNode));
                }
            }
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int v = 4;

        int[][] city = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                int res = dijkstra(edges, i, j, v);
                city[i][j] = res;
            }
        }

        for (int i = 0; i < v; i++) {
            System.out.println(Arrays.toString(city[i]));
        }
    }
}
