public class FrogJumpWithDisKTabulation {

    public static int findMin(int[] arr, int n, int k){
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(arr[1]-arr[0]);

        for(int i=2 ; i<n ; i++){
            int count = Integer.MAX_VALUE;
            for(int j=1 ; j<=k ; j++){
                if(i-j>=0){
                    int ju = dp[i-j] + Math.abs(arr[i]-arr[i-j]);
                    count = Math.min(count,ju);
                }
            }

            dp[i] = count;
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {15, 4, 1, 14, 15};
        int k = 3;
        int n = arr.length;

        int res = findMin(arr, n, k);
        System.out.println(res);
    }
}


