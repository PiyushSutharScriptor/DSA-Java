public class BestTimeToBuySellCoolDownTabulation {

    public static int findMax(int[] prices){

        int n = prices.length;

        int[][] dp = new int[n+2][2];

        for(int idx=n-1 ; idx>=0 ; idx--){
            for(int buy=0 ; buy<=1 ; buy++){

                int profit = 0;

                if(buy==1){
                    profit = Math.max(
                        -prices[idx] + dp[idx+1][0],
                        0 + dp[idx+1][1]
                    );
                }   
                else{
                    profit = Math.max(
                        prices[idx]+dp[idx+2][1],
                        0 + dp[idx+1][0]
                    );
                }

                dp[idx][buy] = profit;
            }
        }

        return dp[0][1];
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,0,2};

        int res = findMax(prices);
        System.out.println(res);
    }
}

