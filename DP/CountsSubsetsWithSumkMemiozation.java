import java.util.*;

public class CountsSubsetsWithSumkMemiozation {

    public static int findCount(int[] arr, int idx, int target, int dp[][]){
        if(target==0) return 1;
        if(idx<0) return 0;

        if(dp[idx][target]!=-1) return dp[idx][target];

        if(idx==0) return arr[idx]==target ? 1 : 0;

        int notTake = findCount(arr, idx-1, target, dp);

        int take = 0;
        if(arr[idx]<=target){
            take = findCount(arr, idx-1, target-arr[idx], dp);
        }

        return dp[idx][target] = take+notTake;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int t = 5;

        int n = arr.length;

        int dp[][] = new int[n][t+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findCount(arr,n-1,t,dp);
        System.out.println(res);
    }
}
