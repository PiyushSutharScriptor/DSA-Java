import java.util.*;

public class BestTimeToBuySellStock4Memoization {

    public static int findMax(int idx, int buy, int cap, int n, int[] prices, int[][][] dp){

        if(idx==n || cap==0) return 0;

        int profit = 0;

        if(dp[idx][buy][cap]!=-1) return dp[idx][buy][cap];

        if(buy==1){
            profit = Math.max(
                -prices[idx] + findMax(idx+1, 0, cap, n, prices, dp),
                0 + findMax(idx+1, 1, cap, n, prices, dp)
            );
        }
        else{
            profit = Math.max(
                prices[idx] + findMax(idx+1, 1, cap-1, n, prices, dp),
                0 + findMax(idx+1, 0, cap, n, prices, dp)                
            );
        }

        return dp[idx][buy][cap] = profit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
        int k = 3;

        int n = prices.length;

        int[][][] dp = new int[n][2][k+1];
        for(int[][] ar : dp){
            for(int[] ar2 : ar){
                Arrays.fill(ar2,-1);
            }
        }

        int prft = findMax(0,1,k,n,prices,dp);
        System.out.println(prft);

    }
}
