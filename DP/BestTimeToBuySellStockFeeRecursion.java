public class BestTimeToBuySellStockFeeRecursion {

    public static int findMax(int idx, boolean buy, int n, int[] prices, int fee){
        if(idx>=n) return 0;

        int profit = 0;

        if(buy){
            profit = Math.max(
                -prices[idx] + findMax(idx+1, false, n, prices,fee),
                0 + findMax(idx+1, true, n, prices,fee)
            );
        }
        else{
            profit = Math.max(
                prices[idx] - fee + findMax(idx+1, true, n, prices,fee),
                0 + findMax(idx+1, false, n, prices,fee)
            );
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;

        int n = prices.length;

        int prft = findMax(0,true,n,prices,fee);
        System.out.println(prft);
    }
}
