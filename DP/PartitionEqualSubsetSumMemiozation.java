import java.util.*;

public class PartitionEqualSubsetSumMemiozation {

    public static boolean findSum(int[] arr, int idx, int t,int[][] dp){
        if(t==0) return true;
        if(idx<0) return false;

        if(dp[idx][t]!=-1) return dp[idx][t]==1 ? true : false;

        if(idx==0 && arr[idx]==t) return true;

        boolean notTake = findSum(arr, idx-1, t,dp);
        boolean take = false;

        if(arr[idx]<=t){
            take = findSum(arr, idx-1, t-arr[idx],dp);
        }

        dp[idx][t] = take||notTake ? 1 : 0;
        return take||notTake;
    }
    public static void main(String[] args) {
        int[] arr = {1, 10, 21, 10};

        int n = arr.length;

        int sum =0;
        for(int el : arr){
            sum+=el;
        }

        if(sum%2==0){
            int size = sum/2;

            int[][] dp = new int[n][size+1];
            for(int[] ar : dp){
                Arrays.fill(ar, -1);
            }

            System.out.println(findSum(arr,n-1,size,dp));
        }
        else System.out.println(false);
    }
}

