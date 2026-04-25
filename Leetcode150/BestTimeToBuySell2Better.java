public class BestTimeToBuySell2Better {

    public static void print(int[] arr){
        for(int el : arr){  
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int n = prices.length;
        int[] arr = new int[n];

        for(int i=0 ; i<n-1 ; i++){
            arr[i] = Math.max(prices[i],prices[i+1]);
        }
        arr[n-1] = prices[n-1];

        int add = 0;
        for(int i=0 ; i<n ; i++){
            add += arr[i]-prices[i];
        }
        print(arr);
        System.out.println(add);

    }
}
