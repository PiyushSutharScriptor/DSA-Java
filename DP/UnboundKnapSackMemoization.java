import java.util.*;

public class UnboundKnapSackMemoization {

    public static int findMax(int idx, int[] wt, int[] val, int target, int[][] dp){

        if(target==0) return 0;
        if(idx<0) return 0;

        if(dp[idx][target]!=-1) return dp[idx][target];

        int notTake = 0 + findMax(idx-1, wt, val, target, dp);

        int take = 0;
        if(wt[idx]<=target){
            take = val[idx] + findMax(idx, wt, val, target-wt[idx], dp);
        }

        return dp[idx][target] = Math.max(take, notTake);
    }

    public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int target = 10;

        int n = wt.length;

        int[][] dp = new int[n][target+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findMax(n-1, wt, val, target,dp);
        System.out.println(res);
    }
}

