import java.util.Arrays;

public class MinimumFallingPathSumMemiozation{

    public static int findPath(int[][] arr, int row, int col, int[][] dp){
        int n = arr.length;
        
        if(row<0 || col<0 || row>=n || col>=n) return (int)1e6;

        if(dp[row][col]!=Integer.MAX_VALUE) return dp[row][col];

        if(row==n-1) return arr[row][col];

        int down = arr[row][col] + findPath(arr, row+1, col, dp);
        int ldiag = arr[row][col] + findPath(arr, row+1, col-1, dp);
        int  rdiag = arr[row][col] + findPath(arr, row+1, col+1, dp);

        return dp[row][col] = Math.min(down,Math.min(ldiag,rdiag));
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};

        int n = arr.length;

        int[][] dp = new int[n][n];
        for(int[] ar : dp){
            Arrays.fill(ar,Integer.MAX_VALUE);
        }

        int mini = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            int res = findPath(arr,0,i,dp);
            mini = Math.min(mini,res);
        }

        System.out.println(mini); 
    }
}
