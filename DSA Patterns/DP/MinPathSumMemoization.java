import java.util.*;

public class MinPathSumMemoization {

    public static int findPath(int x, int y, int[][] arr,int[][] dp){

        if(x<0 || y<0) return (int)1e8;

        if(dp[x][y]!=-1) return dp[x][y];
        if(x==0 && y==0) return dp[x][y] = arr[x][y];

        int up = arr[x][y] + findPath(x-1, y, arr, dp);
        int left = arr[x][y] + findPath(x, y-1, arr, dp);

        return dp[x][y] = Math.min(up,left);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};

        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findPath(m-1,n-1,arr,dp);
        System.out.println(res);
    }    
}
