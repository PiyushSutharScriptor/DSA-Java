public class BestTimeToBuySellCoolDownRecursion {

    public static int findMax(int idx, int buy, int n, int[] prices){
        if(idx>=n) return 0;

        int profit = 0;
        if(buy==1){
            profit = Math.max(
                -prices[idx] + findMax(idx+1, 0, n, prices),
                0 + findMax(idx+1, 1, n, prices)
            );
        }   
        else{
            profit = Math.max(
                prices[idx] + findMax(idx+2, 1, n, prices),
                0 + findMax(idx+1, 0, n, prices)
            );
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        int n = prices.length;

        int res = findMax(0,1,n,prices);
        System.out.println(res);
    }
}
