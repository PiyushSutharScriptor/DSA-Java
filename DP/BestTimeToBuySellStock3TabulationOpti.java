public class BestTimeToBuySellStock3TabulationOpti {

    public static int findMax(int[] prices) {

        int n = prices.length;

        int[][] dp = new int[2][3];

        for (int idx = n-1; idx >= 0; idx--) {

            int[][] temp = new int[2][3];

            for (int buy = 0; buy <= 1; buy++) {
                for(int cap=1 ; cap<=2 ; cap++){
                    
                    int profit = 0;
                    if (buy == 1) {
                        profit = Math.max(
                            -prices[idx] + dp[0][cap],
                            0 + dp[1][cap]
                        );
                    } 
                    else{
                        profit = Math.max(
                            prices[idx] + dp[1][cap-1],
                            0 + dp[0][cap]
                        );
                    }
                    
                    temp[buy][cap] = profit;
                }
            }

            dp = temp;
        }

        return dp[1][2];

    }

    public static void main(String[] args) {
        int[] prices = { 4, 2, 7, 1, 11, 5 };

        int prft = findMax(prices);
        System.out.println(prft);

        // output = 15
    }
}

