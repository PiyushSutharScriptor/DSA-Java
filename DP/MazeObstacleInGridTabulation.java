import java.util.*;

public class MazeObstacleInGridTabulation {

    public static int findPaths(int[][] arr){
        
        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                if(i==0 && j==0){
                    dp[i][j]=1;
                    continue;
                }
                int left = 0;
                int up = 0;

                if(i>0 && arr[i][j]!=1) up = dp[i-1][j];
                if(j>0 && arr[i][j]!=1) left = dp[i][j-1];
                dp[i][j] = left+up;
            }
        }
        
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,0},{0,0,0}};

        int res = findPaths(arr);
        System.out.println(res);
    }
}




