public class MinimumCoinsRecursion{

    public static int findMin(int idx, int[] arr, int amount){

        if(amount==0) return 0;

        if(idx<0) return (int)1e8;

        int notTake = 0 + findMin(idx-1, arr, amount);
        int take = (int)1e8;

        if(arr[idx]<=amount){
            take = 1 + findMin(idx, arr, amount-arr[idx]);
        }

        return Math.min(take,notTake);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int amount = 11;

        int n = arr.length;

        int coins = findMin(n-1, arr,amount);
        System.out.println(coins);
    }
}