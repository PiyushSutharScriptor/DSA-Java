public class BestTimeToBuySell1Opt {
    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4};

        int n = prices.length;
        int maxi = 0;
        int res = 0;
        
        for(int i=n-1 ; i>=0 ; i--){
            maxi = Math.max(maxi,prices[i]);
            int profit = maxi-prices[i];
            res = Math.max(profit, res);
        }
       
        System.out.println(res);
    }
}
