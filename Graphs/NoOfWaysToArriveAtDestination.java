import java.util.*;

class Pair{
    int node;
    int time;

    Pair(int node1, int time1){
        this.node = node1;
        this.time = time1;
    }
}

public class NoOfWaysToArriveAtDestination {

    public static int findWays(int[][] roads, int n){
        List<List<Pair>> li = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : roads){
            int U = edge[0];
            int V = edge[1];
            int T = edge[2];

            li.get(U).add(new Pair(V, T));
            li.get(V).add(new Pair(U, T));
        }

        int[] adj = new int[n];
        Arrays.fill(adj,Integer.MAX_VALUE);
        adj[0] = 0;

        int[] ways = new int[n];
        ways[0] = 1;

        PriorityQueue<Pair> que = new PriorityQueue<>((a,b)->a.time-b.time);
        que.add(new Pair(0, 0));

        while(!que.isEmpty()){
            Pair p = que.poll();
            int nd = p.node;
            int tm = p.time;

            for(Pair pr : li.get(nd)){
                if(adj[pr.node]>pr.time+tm){
                    adj[pr.node] = pr.time+tm;
                    ways[pr.node] = ways[nd];
                    que.add(new Pair(pr.node,adj[pr.node]));
                }
                else if(adj[pr.node]==pr.time+tm){
                    ways[pr.node]+=ways[nd];
                }
            }
        }

        return ways[n-1];
    }

    public static void main(String[] args) {
        int[][] roads = {{0,6,7},{0,1,2},{1,2,3},{1,3,3},{6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};

        int n = 7;

        int res = findWays(roads,n);
        System.out.println(res);
        //output : 4
    }
}
