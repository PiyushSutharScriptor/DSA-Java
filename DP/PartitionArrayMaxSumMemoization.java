import java.util.*;

public class PartitionArrayMaxSumMemoization {

    public static int  findMax(int ind, int n , int[] arr, int k, int[] dp){

        if(ind==n) return 0;

        if(dp[ind]!=-1) return dp[ind];

        int sum = Integer.MIN_VALUE;
        int maxi = Integer.MIN_VALUE;
        int len = 0;

        for(int j=ind ; j<(Math.min(ind+k,n)) ; j++){
            len++;
            maxi = Math.max(maxi,arr[j]);

            int total = len*maxi + findMax(j+1, n, arr, k, dp);
            sum = Math.max(sum,total);
        }   

        return dp[ind] = sum;
    }
        
    public static void main(String[] args) {
        int[] arr = {1,15,7,9,2,5,10};
        int k = 3;

        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        int res = findMax(0,n,arr,k,dp);
        System.out.println(res);
    }    
}

