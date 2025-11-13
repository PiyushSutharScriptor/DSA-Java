public class BestTimeToBuySellStock2Recursion {

    public static int findMax(int idx, boolean buy, int n, int[] prices){
        if(idx>=n) return 0;

        int profit = 0;

        if(buy){
            profit = Math.max(
                -prices[idx] + findMax(idx+1, false, n, prices),
                0 + findMax(idx+1, true, n, prices)
            );
        }
        else{
            profit = Math.max(
                prices[idx] + findMax(idx+1, true, n, prices),
                0 + findMax(idx+1, false, n, prices)
            );
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int n = prices.length;

        int prft = findMax(0,true,n,prices);
        System.out.println(prft);
    }
}
