import java.util.*;

class Pair{
    int node;
    int time;

    Pair(int node1, int time1){
        this.node = node1;
        this.time = time1;
    }
}

public class NetworkDelayTime {

    public static int findMinTime(int[][] times, int n, int k){
        List<List<Pair>> li = new ArrayList<>();
        for(int i=0 ; i<=n ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : times){
            int U = edge[0];
            int V = edge[1];
            int T = edge[2];

            li.get(U).add(new Pair(V, T));
        }

        int[] adj = new int[n+1];
        Arrays.fill(adj,Integer.MAX_VALUE);
        adj[k] = 0;

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(k, 0));

        while(!que.isEmpty()){
            Pair p = que.poll();
            int nd = p.node;
            int tm = p.time;

            for(Pair pr : li.get(nd)){
                if(adj[pr.node]>pr.time+tm){
                    adj[pr.node] = pr.time+tm;
                    que.add(new Pair(pr.node,adj[pr.node]));
                }
            }
        }

        int res = 0;    
        for(int i=1 ; i<adj.length ; i++){
            if(adj[i]==Integer.MAX_VALUE) return -1;
            res = Math.max(res,adj[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k = 2;

        int res = findMinTime(times, n, k);
        System.out.println(res);
    }
}
