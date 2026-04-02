import java.util.*;

public class BellmanFordAlgorithm {
    public static void main(String[] args) {
        int edges[][] = {{3,2,6},{5,3,1},{0,1,5},{1,5,-3},{1,2,-2},{3,4,-2},{2,4,3}};
        int n = 6;

        int MAXI = (int)1e8;
        int len = edges.length;

        int[] dist = new int[n];
        Arrays.fill(dist,MAXI);
        dist[0] = 0;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<len ; j++){
                int u = edges[j][0];
                int v = edges[j][1];
                int wt = edges[j][2];

                if((dist[u]+wt) < dist[v]){
                    dist[v] = dist[u]+wt;
                }
            }
        }
        
        for(int i=0 ; i<n ; i++){
            System.out.print(dist[i] + " ");        
        }
    }
}
