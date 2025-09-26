
import java.util.*;

class Pair{
    int node;
    int dist;

    Pair(int dist1, int node1){
        this.dist = dist1;
        this.node = node1;
    }
}


public class DijkstraAlgorithmUsingQueue {

    public static int[] findDijkstra(int grid[][], int n, int v, int k){

        List<List<Pair>> li = new ArrayList<>();

        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : grid){
            int U = edge[0];
            int V = edge[1];
            int D = edge[2];

            li.get(U).add(new Pair(D, V));
        }

        Queue<Pair> pq = new LinkedList<>();
        pq.add(new Pair(0,k));

        int[] res = new int[v];
        Arrays.fill(res,Integer.MAX_VALUE);

        res[k] = 0;

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int node = p.node;
            int dist = p.dist;

            for(Pair pr : li.get(node)){
                if(res[pr.node]>pr.dist+dist){
                    res[pr.node] = pr.dist+dist;
                    pq.add(new Pair(pr.dist+dist, pr.node));
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int grid[][] = {{0,1,4},{0,2,4},{1,0,4},{1,2,2},{2,0,4},{2,1,2},{2,3,3},{2,4,1},{2,5,6},{3,2,3},{3,5,2},{4,2,1},{4,5,3},{5,2,6},{5,3,2},{5,4,3}};

        int n = grid.length;
        int v = 6;
        int k = 0;

        int[] res = findDijkstra(grid,n,v,k);

        for(int el : res){
            System.out.print(el + " ");
        }
    }
}

