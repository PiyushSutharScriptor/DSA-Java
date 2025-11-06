import java.util.*;

public class MinimumCoinsMemiozation{

    public static int findMin(int idx, int[] arr, int amount, int[][] dp){
    
        if(amount==0) return 0;

        if(idx<0) return (int)1e8;

        if(dp[idx][amount]!=-1) return dp[idx][amount];

        int notTake = 0 + findMin(idx-1, arr, amount,dp);
        int take = (int)1e8;

        if(arr[idx]<=amount){
            take = 1 + findMin(idx, arr, amount-arr[idx], dp);
        }

        return dp[idx][amount] = Math.min(take,notTake);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,4};
        int amount = 3;

        int n = arr.length;

        int[][] dp = new int[n][amount+1];
        for(int ar[] : dp){
            Arrays.fill(ar,-1);
        }

        int ans = findMin(n-1, arr,amount,dp);

        if(ans==(int)1e8) System.out.println(-1);
        else System.out.println(ans);
    }
}