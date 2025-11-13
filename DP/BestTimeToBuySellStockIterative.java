public class BestTimeToBuySellStockIterative{
    public static void main(String[] args) {
        
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;

        int mini = arr[0];
        int profit = 0;

        for(int i=1 ; i<n ; i++){
            mini = Math.min(mini, arr[i-1]);

            if(arr[i]>mini){
                profit = Math.max(profit, arr[i]-mini);
            }
        }

        System.out.println(profit);
    }
}