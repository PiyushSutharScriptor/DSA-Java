import java.util.*;

public class LongestIncreasingSubsequenceMemoization {

    public static int findMax(int curr, int prev, int n, int[] arr, int[][] dp){
        if(curr == n) return 0;
        
        if(dp[curr][prev+1]!=-1) return dp[curr][prev+1];

        int notTake = findMax(curr+1, prev, n, arr, dp);

        int take = 0;
        if(prev==-1 || arr[curr]>arr[prev]){
            take = 1 + findMax(curr+1, curr, n, arr, dp);
        }

        return dp[curr][prev+1] = Math.max(notTake, take);
    }

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};

        int n = arr.length;

        int[][] dp = new int[n][n+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findMax(0,-1,n,arr,dp);
        System.out.println(res);
    }
}
