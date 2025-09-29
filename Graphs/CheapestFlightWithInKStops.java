import java.util.*;

class Pair{
    int stop;
    int node;
    int dist;

    Pair(int stop1, int node1, int dist1){
        this.stop = stop1;
        this.node = node1;
        this.dist = dist1;
    }
}

class AdjPair{
    int node;
    int dist;

    AdjPair(int node1, int dist1){
        this.node = node1;
        this.dist = dist1;
    }
}

public class CheapestFlightWithInKStops {

    public static int findFlight(int[][] flights, int src, int dst, int k, int n){
        List<List<AdjPair>> li = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : flights){
            int U = edge[0];
            int V = edge[1];
            int D = edge[2];

            li.get(U).add(new AdjPair(V, D));
        }

        int adj[] = new int[n];
        Arrays.fill(adj,Integer.MAX_VALUE);
        adj[src] = 0;

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(0, src, 0));
        
        while(!que.isEmpty()){
            Pair p = que.poll();
            int st = p.stop;
            int nd = p.node;
            int di = p.dist;

            if(st>k) continue;

            for(AdjPair pr : li.get(nd)){
                if(adj[pr.node]>pr.dist+di){
                    adj[pr.node] = pr.dist+di;
                    que.add(new Pair(st+1, pr.node, adj[pr.node]));
                }
            }
        }

        if(adj[dst]==Integer.MAX_VALUE) return -1;
        return adj[dst];
    }
    public static void main(String[] args) {
        int flights[][] = {{0,1,100},{1,2,100},{0,2,500}};
        int src = 0;
        int dst = 2;
        int k = 1;
        int n = 3;

        int res = findFlight(flights, src, dst, k, n);
        System.out.println(res);
    }
}
