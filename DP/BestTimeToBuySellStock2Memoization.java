import java.util.*;

public class BestTimeToBuySellStock2Memoization {

    public static int findMax(int idx, int buy, int n, int[] prices, int[][] dp){
        if(idx>=n) return 0;

        int profit = 0;

        if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==1){
            profit = Math.max(
                -prices[idx] + findMax(idx+1, 0, n, prices, dp),
                0 + findMax(idx+1, 1, n, prices, dp)
            );
        }
        else{
            profit = Math.max(
                prices[idx] + findMax(idx+1, 1, n, prices, dp),
                0 + findMax(idx+1, 0, n, prices, dp)
            );
        }

        return dp[idx][buy] = profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int n = prices.length;

        int[][] dp = new int[n][2];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int prft = findMax(0,1,n,prices,dp);
        System.out.println(prft);
    }
}

