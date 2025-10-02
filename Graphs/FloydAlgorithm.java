import java.util.*;

public class FloydAlgorithm {
    public static int[][] findPath(int edges[][], int v){
        
        int[][] cost = new int[v][v];
        for(int i=0 ; i<v ; i++){
            Arrays.fill(cost[i],Integer.MAX_VALUE);
            cost[i][i] = 0;
        }

        for(int[] edge : edges){
            int U = edge[0];
            int V = edge[1];
            int D = edge[2];

            cost[U][V] = D;
        }

        for(int k=0 ; k<v ; k++){

            for(int i=0 ; i<v ; i++){
                for(int j=0 ; j<v ; j++){
                    if(cost[i][k]!=Integer.MAX_VALUE && cost[k][j]!=Integer.MAX_VALUE){
                        if(cost[i][j]>cost[i][k]+cost[k][j]){
                            cost[i][j] = cost[i][k]+cost[k][j];
                        }
                    }
                }
            }

        }

        return cost;
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1,2},{1,0,1},{1,2,3},{3,2,4},{3,0,3},{3,1,5}};
        int v = 4;

        int[][] res = findPath(edges,v);

        for(int i=0 ; i<v ; i++){
            for(int j=0 ; j<v ; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
