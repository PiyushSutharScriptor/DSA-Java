import java.util.*;

public class SubsetSumEqualsKMemoization {

    public static boolean findSet(int idx, int target, int[] arr, int[][] dp){

        if(idx<0) return false;
        if(target==0) return true;
        
        if(idx==0 && arr[idx]==target) return true;

        if(dp[idx][target]!=-1){
            return dp[idx][target]==1 ? true : false;
        }

        boolean notTake = findSet(idx-1, target, arr, dp);
        boolean take = false;

        if(arr[idx]<=target){
            take = findSet(idx-1, target-arr[idx], arr, dp);
        }

        dp[idx][target] = notTake||take ? 1 : 0 ;

        return notTake||take;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 5;

        int n = arr.length;

        int[][] dp = new int[n][target+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }
        System.out.println(findSet(n-1,target,arr,dp));
    }
}

