import java.util.*;

public class TargetSumMemoization {
    public static int findTar(int idx, int t, int[] arr,int[][] dp){

        if(dp[idx][t]!=-1) return dp[idx][t];

        if(idx==0){
            int cnt = 0;
            if(t==0 && arr[0]==0) cnt=2;
            else if(t==0 || arr[0]==t) cnt=1;
            return dp[idx][t]=cnt;
        }

        int notTake = findTar(idx-1, t, arr, dp);
        int take = 0;
        if(t>=arr[idx]){
            take = findTar(idx-1, t-arr[idx], arr, dp);
        }

        return dp[idx][t]=take+notTake;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int target = 3;

        int n = arr.length;

        int sum = 0;
        for(int el : arr){
            sum+=el;
        }

        if((target + sum)%2 != 0 || Math.abs(target) > sum){
            System.out.println(0);
            return;
        }

        int t = (target+sum)/2;
        int[][] dp = new int[n][t+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findTar(n-1,t,arr,dp);
        System.out.println(res);
    }                                       
}                       