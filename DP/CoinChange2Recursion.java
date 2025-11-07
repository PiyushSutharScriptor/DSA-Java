public class CoinChange2Recursion {

    public static int findWays(int idx, int[] arr, int target){
        if(target==0) return 1;
        if(idx<0) return 0;

        int notTake = findWays(idx-1, arr, target);

        int take = 0;
        if(arr[idx]<=target){
            take = findWays(idx, arr, target-arr[idx]);
        }

        return notTake+take;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 4;

        int n = arr.length;

        int res = findWays(n-1, arr, target);
        System.out.println(res);
    }
}
