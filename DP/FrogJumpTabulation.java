public class FrogJumpTabulation {

    public static int findMin(int[] arr, int n){
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(arr[1]-arr[0]);

        for(int i=2 ; i<n ; i++){
            int left = dp[i-1] + Math.abs(arr[i]-arr[i-1]);
            int right = dp[i-2] + Math.abs(arr[i]-arr[i-2]);

            dp[i] = Math.min(left,right);
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {5,2,1,4};
        int n = arr.length;

        int res = findMin(arr, n);
        System.out.println(res);
    }
}

