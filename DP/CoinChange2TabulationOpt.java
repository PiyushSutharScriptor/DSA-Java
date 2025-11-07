public class CoinChange2TabulationOpt {

    public static int findWays(int[] arr, int target){
        int n = arr.length;

        int[]dp = new int[target+1];

        for (int t = 0; t <= target; t++) {
            if (t % arr[0] == 0) dp[t] = 1;
        }

        for(int idx=1 ; idx<n ; idx++){
            int[] temp = new int[target+1];
            temp[0] = 1;

            for(int t=0 ; t<=target ; t++){
                int notTake = dp[t];

                int take = 0;
                if(arr[idx]<=t){
                    take = temp[t-arr[idx]];
                }

                temp[t] = take+notTake;
            }

            dp = temp;
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 4;

        int res = findWays(arr, target);
        System.out.println(res);
    }
}


