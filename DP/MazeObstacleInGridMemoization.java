import java.util.*;

public class MazeObstacleInGridMemoization {

    public static int findPaths(int[][] arr, int row, int col, int[][] dp){
        if(row<0 || col<0 || arr[row][col]==1) return 0;

        if(dp[row][col]!=-1) return dp[row][col];

        if(row==0 && col==0) return 1;

        int up = findPaths(arr, row-1, col, dp);
        int left = findPaths(arr, row, col-1, dp);

        return dp[row][col] = up+left; 
    }
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,0},{0,0,0}};

        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }

        int res = findPaths(arr,m-1,n-1,dp);
        System.out.println(res);
    }
}



