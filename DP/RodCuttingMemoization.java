import java.util.*;

public class RodCuttingMemoization {

    public static int findMaxi(int idx, int[] price, int target, int[][] dp){

        if(target==0) return 0;
        if(idx<0) return 0;

        if(dp[idx][target]!=-1) return dp[idx][target];

        int notTake = 0 + findMaxi(idx-1, price, target, dp);

        int take = 0;
        if(idx+1<=target){
            take = price[idx] + findMaxi(idx, price, target-(idx+1), dp);
        }

        return dp[idx][target] = Math.max(take,notTake);
 
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9};
        int target = 4;

        int n = price.length;

        int[][] dp = new int[n][target+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findMaxi(n-1,price,target,dp);
        System.out.println(res);
    }
}
