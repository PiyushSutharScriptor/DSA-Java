import java.util.*;

public class CityWithSmallNeighbourUsingFloydAlgo {
    public static int findNeigh(int[][] edges, int v, int dt){
        
        int[][] city = new int[v][v];
        for(int i=0 ; i<v ; i++){
            Arrays.fill(city[i],Integer.MAX_VALUE);
            city[i][i] = 0;
        }

        for(int[] edge : edges){
            int U = edge[0];
            int V = edge[1];
            int D = edge[2];

            city[U][V] = D;
            city[V][U] = D;
        }

        //Floyd algo
        for(int k=0 ; k<v ; k++){

            for(int i=0 ; i<v ; i++){
                for(int j=0 ; j<v ; j++){
                    if(city[i][k]!=Integer.MAX_VALUE && city[k][j]!=Integer.MAX_VALUE){
                        if(city[i][j]>city[i][k]+city[k][j]){
                            city[i][j]=city[i][k]+city[k][j];
                        }
                    }
                }
            }
        }

        //finding cities 
        int res = -1;
        int maxCity = v+1;
        
        for(int i=0 ; i<v ; i++){
            int count = 0;

            for(int j=0 ; j<v ; j++){
                if(city[i][j]!=Integer.MAX_VALUE && city[i][j]<=dt){
                    count++;
                }
            }

            if(count<=maxCity){
                maxCity = count;
                res = i; //storing highest city among all the lowest neighbour
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int v = 4;
        int dt = 4;

        int res = findNeigh(edges, v, dt);
        System.out.println(res);

        //output : 3
    }
}
