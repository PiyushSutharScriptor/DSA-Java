import java.util.*;

public class TargetSumMemoization {
    public static int findTar(int idx, int t, int[] arr,int[][] dp){

        if(dp[idx][t]!=-1) return dp[idx][t];

        if(idx==0){
            int cnt = 0;

            if(t+arr[idx]==0) cnt++;
            if(t-arr[idx]==0) cnt++;
            
            return dp[idx][t]=cnt;
        }

        int add = findTar(idx-1, t+arr[idx], arr, dp);
        int sub = findTar(idx-1, t-arr[idx], arr, dp);

        return dp[idx][t]=add+sub;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int target = 3;

        int n = arr.length;

        int[][] dp = new int[n][target+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findTar(n-1,target,arr,dp);
        System.out.println(res);
    }                                       
}                       