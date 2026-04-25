public class BestTimeToBuySell1Bru{
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int n = prices.length;
        int maxi = 0;

        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                int profit = prices[j]-prices[i];
                maxi = Math.max(profit,maxi);
            }
        }

        System.out.println(maxi);
    }
}