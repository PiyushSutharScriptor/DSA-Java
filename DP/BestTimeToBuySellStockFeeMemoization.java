import java.util.*;

public class BestTimeToBuySellStockFeeMemoization {

    public static int findMax(int idx, int buy, int n, int[] prices, int[][] dp, int fee){
        if(idx>=n) return 0;

        int profit = 0;

        if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==1){
            profit = Math.max(
                -prices[idx] + findMax(idx+1, 0, n, prices, dp, fee),
                0 + findMax(idx+1, 1, n, prices, dp, fee)
            );
        }
        else{
            profit = Math.max(
                prices[idx] - fee+ findMax(idx+1, 1, n, prices, dp, fee),
                0 + findMax(idx+1, 0, n, prices, dp, fee)
            );
        }

        return dp[idx][buy] = profit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;

        int n = prices.length;

        int[][] dp = new int[n][2];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int prft = findMax(0,1,n,prices,dp,fee);
        System.out.println(prft);
    }
}

