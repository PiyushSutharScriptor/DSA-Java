
import java.util.*;

public class CountPartitionWithDIffMemoization {

    public static int findPossible(int[] arr, int idx, int target, int[][] dp){

        if(target==0) return 1;
        if(idx<0) return 0;

        if(dp[idx][target]!=-1) return dp[idx][target];

        if(idx==0 && arr[0]==target) return 1;

        int notTake = findPossible(arr, idx-1, target, dp);

        int take = 0;
        if(arr[idx]<=target){
            take = findPossible(arr, idx-1, target-arr[idx], dp);
        }

        dp[idx][target] = take+notTake;

        return dp[idx][target];
    }

    public static void main(String[] args){
        int[] arr = {1, 1, 2, 3};
        int d = 1;
        
        int sum = 0;
        for(int el : arr){
            sum+=el;
        }

        int target = (sum-d)/2;

        int n = arr.length;
        int[][] dp = new int[n][target+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        findPossible(arr, n-1, target, dp);

        System.out.println(dp[n-1][target]);
    }
}

