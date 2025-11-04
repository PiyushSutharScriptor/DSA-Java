import java.util.*;

public class PartitionSetWithMinSumMemoization {

    public static boolean findPossible(int[] arr, int idx, int target, int[][] dp){

        if(target==0) return true;
        if(idx<0) return false;

        if(dp[idx][target]!=-1) return dp[idx][target]==1 ? true : false;

        if(idx==0 && arr[0]==target) return true;

        boolean notTake = findPossible(arr, idx-1, target, dp);

        boolean take = false;
        if(arr[idx]<=target){
            take = findPossible(arr, idx-1, target-arr[idx], dp);
        }

        dp[idx][target] = take||notTake ? 1 : 0 ;

        return take||notTake;
    }

    public static void main(String[] args){
        int[] arr = {3,2,7};

        int sum = 0;
        for(int el : arr){
            sum+=el;
        }

        int n = arr.length;
        int[][] dp = new int[n][sum+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        for (int i = 0; i <= sum; i++) {
            findPossible(arr, n-1, i, dp);
        }

        int mini = Integer.MAX_VALUE;

        for(int i=0 ; i<=sum ; i++){
        // for(int i=0 ; i<=sum/2 ; i++){ optimized
            if(dp[n-1][i]==1){
                int s1 = i;
                int s2 = sum-i;
                mini = Math.min(mini, Math.abs(s1-s2));
            }
        }

        System.out.println(mini);
    }
}
