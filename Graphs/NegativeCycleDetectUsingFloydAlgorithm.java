import java.util.*;

public class NegativeCycleDetectUsingFloydAlgorithm {
    public static boolean findCycle(int edges[][], int v){
        
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

        for(int i=0 ; i<v ; i++){
            for(int j=0 ; j<v ; j++){
                if(cost[i][j]<0) return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[][] edges = {{0,1,-2},{1,2,-3},{2,0,3}};
        int v = 3;

        System.out.println(findCycle(edges,v));
    }
}

