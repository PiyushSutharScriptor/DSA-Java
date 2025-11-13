public class BestTimeToBuySellStock3Recursion {

    public static int findMax(int idx, boolean buy, int cap, int n, int[] prices){

        if(idx>=n || cap>=4) return 0;

        int profit = 0;

        if(buy){
            profit = Math.max(
                -prices[idx] + findMax(idx+1, false, cap+1, n, prices),
                0 + findMax(idx+1, true, cap, n, prices)
            );
        }
        else{
            profit = Math.max(
                prices[idx] + findMax(idx+1, true, cap+1, n, prices),
                0 + findMax(idx+1, false, cap, n, prices)                
            );
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};

        int n = prices.length;

        int prft = findMax(0,true,0,n,prices);
        System.out.println(prft);

    }
}
