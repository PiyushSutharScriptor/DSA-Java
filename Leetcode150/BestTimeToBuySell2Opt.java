public class BestTimeToBuySell2Opt {

    public static void print(int[] arr){
        for(int el : arr){  
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int n = prices.length;
        int add = 0;

        for(int i=0 ; i<n-1 ; i++){
            int res = Math.max(prices[i],prices[i+1]);
            add += res-prices[i];
        }

        System.out.println(add);

    }
}
