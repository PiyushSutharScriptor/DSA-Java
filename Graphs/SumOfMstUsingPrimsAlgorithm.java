import java.util.*;

class Pair{
    int node;
    int dist;

    Pair(int dist1, int node1){
        this.dist = dist1;
        this.node = node1;
    }
}

public class SumOfMstUsingPrimsAlgorithm{

    public static int findSum(int[][] edges, int v){

        List<List<Pair>> li = new ArrayList<>();
        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int U = edge[0];
            int V = edge[1];
            int D = edge[2];

            li.get(U).add(new Pair(D,V));
            li.get(V).add(new Pair(D,U));
        }

        boolean[] visited = new boolean[v];

        PriorityQueue<Pair> que = new PriorityQueue<>((a,b)->a.dist-b.dist);
        que.add(new Pair(0, 0));

        int sum = 0;
        while(!que.isEmpty()){
            Pair p = que.poll();
            int nd = p.node;
            int d = p.dist;

            if(!visited[nd]){
                visited[nd] = true;
                sum+=d;

                for(Pair pr : li.get(nd)){
                    if(!visited[pr.node]){
                        que.add(new Pair(pr.dist, pr.node));
                    }
                }

            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1,2},{0,2,1},{1,2,1},{2,4,2},{2,3,2},{3,4,1}};
        int v = 5;

        int res = findSum(edges,v);
        System.out.println(res);
    }
}
