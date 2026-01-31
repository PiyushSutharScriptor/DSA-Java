import java.util.*;

public class SubSetWithSumKMemoization {

    public static int findCnt(int[] arr, int k, int idx, int[][] dp){

        if(k<0) return 0;

        if(dp[k][idx]!=-1) return dp[k][idx];

        if(idx==0){
            if(k==0 && arr[idx]==0) return 2;
            if(k==0 || arr[idx]==k) return 1;
            return dp[k][idx]=0;
        }


        int take = findCnt(arr, k-arr[idx], idx-1, dp);
        int notTake = findCnt(arr, k, idx-1, dp);

        return dp[k][idx] = take+notTake;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int k = 4;

        int n = arr.length;

        int[][] dp = new int[k+1][n];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }
        
        int res = findCnt(arr,k,n-1,dp);
        System.out.println(res);
    }
}

