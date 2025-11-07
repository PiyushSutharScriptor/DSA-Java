//only for positive elements 
import java.util.*;

public class TargetSumMemoization {

    public static int findWays(int idx, int[] arr,int target, int[][] dp){
        if(target==0) return 1;
        if(idx<0) return 0;

        if(dp[idx][target]!=-1) return dp[idx][target];

        int notTake =  findWays(idx-1, arr,target,dp);

        int take = 0;
        if(arr[idx]<=target){
            take = findWays(idx-1, arr, target-arr[idx],dp);
        }

        return dp[idx][target] = take+notTake;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 1, 5};
        int n = arr.length;
        int target = 3;

        int[][] dp = new int[n][target+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findWays(n-1,arr,target,dp);
        System.out.println(res);
    }
}