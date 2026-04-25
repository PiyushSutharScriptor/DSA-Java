public class BestTimeToBuySell1Better {
    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4};

        int n = prices.length;
        int[] arr = new int[n];
        int maxi = 0;

        for(int i=n-1 ; i>=0 ; i--){
            maxi = Math.max(maxi,prices[i]);
            arr[i] = maxi;
        }
        
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

        maxi = 0;
        for(int i=0 ; i<n ; i++){
            int profit = arr[i]-prices[i];
            maxi = Math.max(profit, maxi);
        }

        System.out.println();
        System.out.println(maxi);
    }
}
