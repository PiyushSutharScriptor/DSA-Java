import java.util.*;

public class BellmanFordAlgorithm {
    public static int[] findPath( int v, int[][] edges, int src){

        int n = edges.length;

        int adj[] = new int[v];
        Arrays.fill(adj, Integer.MAX_VALUE);
        adj[src] = 0;

        for(int i=0 ; i<v-1 ; i++){

            for(int j=0 ; j<n ; j++){
                int U = edges[j][0];
                int V = edges[j][1];
                int D = edges[j][2];
                
                if(adj[U]!=Integer.MAX_VALUE && adj[V]>adj[U]+D){
                    adj[V] = adj[U]+D;
                }
            }
        }

        return adj;
    }

    public static void main(String[] args) {
        int v = 6;
        int[][] edges = {{3, 2, 6}, {5, 3, 1}, {0, 1, 5}, {1, 5, -3}, {1, 2, -2}, {3, 4,-2}, {2, 4, 3}};
        int src = 0;

        int[] res = findPath(v,edges,src);

        for(int el : res){
            System.out.print(el + " ");
        }
        //output : 0 5 3 3 1 2
    }
}
