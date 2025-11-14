public class BestTimeToBuySellStockFeeTabulationOpt {

    public static int findMax(int[] prices, int fee){

        int n = prices.length;

        int[]dp = new int[2];

        for(int idx=n-1 ; idx>=0 ; idx--){

            int[] temp = new int[2];

            for(int buy=0 ; buy<=1 ; buy++){
                int profit = 0;
                if(buy==1){
                    profit = Math.max(
                        -prices[idx] + dp[0],
                        0 + dp[1]
                    );
                }
                else{
                    profit = Math.max(
                        prices[idx] - fee + dp[1],
                        0 + dp[0]
                    );
                }
                temp[buy] = profit;

            }

            dp = temp;
        }

        return dp[1];
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;

        int prft = findMax(prices,fee);
        System.out.println(prft);
    }
}



