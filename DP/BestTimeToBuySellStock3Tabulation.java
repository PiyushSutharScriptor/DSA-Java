public class BestTimeToBuySellStock3Tabulation {

    public static int findMax(int[] prices) {

        int n = prices.length;

        int[][][] dp = new int[n + 1][2][3];

        for (int idx = n-1; idx >= 0; idx--) {
            for (int buy = 0; buy <= 1; buy++) {
                for(int cap=1 ; cap<=2 ; cap++){
                    
                    int profit = 0;
                    if (buy == 1) {
                        profit = Math.max(
                            -prices[idx] + dp[idx + 1][0][cap],
                            0 + dp[idx + 1][1][cap]
                        );
                    } 
                    else{
                        profit = Math.max(
                            prices[idx] + dp[idx + 1][1][cap-1],
                            0 + dp[idx + 1][0][cap]
                        );
                    }
                    
                    dp[idx][buy][cap] = profit;
                }
            }
        }

        return dp[0][1][2];

    }

    public static void main(String[] args) {
        int[] prices = { 1, 3, 2, 8, 4, 9 };

        int prft = findMax(prices);
        System.out.println(prft);

        // output = 12
    }
}
