import java.util.*;

public class MaxSumPathGridTabulation{

    public static int findMax(int[][] arr){

        
        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(i<0 || j<0){
                    continue;
                }

                if(i==0 && j==0){
                    dp[i][j]=arr[i][j];
                    continue;
                }

                int up = (int)-1e8;
                int left = (int)-1e8;

                if(i>0) up = arr[i][j] + dp[i-1][j];
                if(j>0) left = arr[i][j] + dp[i][j-1];

                dp[i][j] = Math.max(up,left);
            }
        }        

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};

        int res = findMax(grid);
        System.out.println(res);
    }
}


