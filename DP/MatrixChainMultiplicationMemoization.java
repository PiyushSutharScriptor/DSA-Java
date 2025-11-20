import java.util.*;

public class MatrixChainMultiplicationMemoization{

    public static int findMin(int i, int j, int[] arr, int[][] dp){
        if(i==j) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        int mini = Integer.MAX_VALUE;

        for(int k=i ; k<j ; k++){
            int steps = arr[i-1]*arr[k]*arr[j]
                        + findMin(i, k, arr,dp)
                        + findMin(k+1, j, arr,dp);
            
            mini = Math.min(mini,steps);
        }

        return dp[i][j] = mini;

    }
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25};
        int n = arr.length;

        int[][] dp = new int[n][n];
        for(int[] ar : dp){ 
            Arrays.fill(ar,-1);
        }

        int res = findMin(1,n-1,arr,dp);
        System.out.println(res);
    }
}