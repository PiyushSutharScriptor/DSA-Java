import java.util.*;

class Pair{
    int dist;
    int node;

    Pair(int dist1, int node1){
        this.dist = dist1;
        this.node = node1;
    }
}

public class FindShortestPathAndPrintUsingDijkstraAlgorithm {

    public static List<Integer> findPath(int[][] edges, int n, int v, int src, int dest){
        List<List<Pair>> li = new ArrayList<>();
        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int U = edge[0];
            int V = edge[1];
            int D = edge[2];

            li.get(U).add(new Pair(D, V));
        }

        int parent[] = new int[v];
        for(int i=0 ; i<v ; i++){
            parent[i] = i;
        }

        int[] visit = new int[v];
        Arrays.fill(visit, Integer.MAX_VALUE);
        visit[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(a.dist==b.dist) return a.node-b.node;
            return a.dist-b.dist;
        });

        pq.add(new Pair(0, src));

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int nd = p.node;
            int dt = p.dist;

            for(Pair pr : li.get(nd)){
                if(visit[pr.node]>pr.dist+dt){
                    visit[pr.node] = pr.dist+dt;
                    pq.add(new Pair(pr.dist+dt, pr.node));
                    parent[pr.node] = nd;
                }
            }
        }

        //if my destination is not reachable : 
        if(visit[dest]==Integer.MAX_VALUE){
            return new ArrayList<>();
        }

        //if reachable : 

        List<Integer> res = new ArrayList<>();
        int node = dest;
        
        while(node!=parent[node]){
            res.add(node);
            node = parent[node];
        }
        res.add(src);

        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1,2},{0,2,4},{1,2,1},{1,3,7},{2,4,3},{3,4,1}};
        int v = 5;
        int n = 6;
        int src = 0; 
        int dest = 4;

        List<Integer> ans = findPath(edges,n,v,src,dest);
        System.out.println(ans);
    }
}
