public class CoinChange2Tabulation {

    public static int findWays(int[] arr, int target){
        int n = arr.length;

        int[][] dp = new int[n][target+1];

        for (int t = 0; t <= target; t++) {
            if (t % arr[0] == 0) dp[0][t] = 1;
        }

        for(int idx=1 ; idx<n ; idx++){
            for(int t=0 ; t<=target ; t++){
                int notTake = dp[idx-1][t];

                int take = 0;
                if(arr[idx]<=t){
                    take = dp[idx][t-arr[idx]];
                }

                dp[idx][t] = take+notTake;
            }
        }

        return dp[n-1][target];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 4;

        int res = findWays(arr, target);
        System.out.println(res);
    }
}

