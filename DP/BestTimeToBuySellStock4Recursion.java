public class BestTimeToBuySellStock4Recursion {

    public static int findMax(int idx, boolean buy, int cap, int n, int[] prices){

        if(idx==n || cap==0) return 0;

        int profit = 0;

        if(buy){
            profit = Math.max(
                -prices[idx] + findMax(idx+1, false, cap+1, n, prices),
                0 + findMax(idx+1, true, cap, n, prices)
            );
        }
        else{
            profit = Math.max(
                prices[idx] + findMax(idx+1, true, cap-1, n, prices),
                0 + findMax(idx+1, false, cap, n, prices)                
            );
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
        int k = 3;

        int n = prices.length;

        int prft = findMax(0,true,k,n,prices);
        System.out.println(prft);

    }
}
