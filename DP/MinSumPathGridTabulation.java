import java.util.*;

public class MinSumPathGridTabulation {

    public static int findMin(int[][] arr, int row , int col,int[][] dp){

        if(row<0 || col<0) return (int)1e8;

        if(dp[row][col]!=-1) return dp[row][col];

        if(row==0 && col==0){
            return arr[0][0];
        }

        int up = arr[row][col] + findMin(arr, row-1, col,dp);
        int left = arr[row][col] + findMin(arr, row, col-1,dp);

        
        return dp[row][col] = Math.min(up,left);
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findMin(grid,m-1,n-1,dp);
        System.out.println(res);
    }
}

