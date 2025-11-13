public class BestTimeToBuySellStock4TabulationOpti {

    public static int findMax(int[] prices, int k) {

        int n = prices.length;

        int[][] dp = new int[2][k+1];

        for (int idx = n-1; idx >= 0; idx--) {

            int[][] temp = new int[2][k+1];

            for (int buy = 0; buy <= 1; buy++) {
                for(int cap=1 ; cap<=k ; cap++){
                    
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

        return dp[1][k];

    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
        int k = 3;

        int prft = findMax(prices,k);
        System.out.println(prft);

        // output = 15
    }
}


